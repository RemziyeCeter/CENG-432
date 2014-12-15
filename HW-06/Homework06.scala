case class User(name: String, email: String, grade: Int)

trait UserManagerTrait {
  def add(name: String, email: String, grade: Int): Option[User]
  def getUser(email: String): Option[User]
  def getUserListForGrade(grade: Int): List[User]
  def getCertainGrades(gradeSelector: (Int) => Boolean): List[String]
}
object UserManager extends UserManagerTrait {
  var userList: List[User] = List()

  def add(name: String, email: String, grade: Int): Option[User] = {
    val tmpUser = new User(name, email, grade)
    if (userList.contains(tmpUser)) {
      return None
    } else
      userList = userList :+ tmpUser
    return Option(tmpUser)
  }

  def getUser(email: String): Option[User] = {
    val user = userList.find(user => user.email == email)
    return user
  }

  def getUserListForGrade(grade: Int): List[User] = {
    userList.filter(x => x.grade == grade).toList
  }

  def getCertainGrades(gradeSelector: (Int) => Boolean): List[String] = {
    userList.filter(y => gradeSelector(y.grade)).map(y => y.name).toList
  }
}

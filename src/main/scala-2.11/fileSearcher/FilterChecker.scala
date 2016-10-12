package fileSearcher

/**
  * Created by Sean on 10/10/2016.
  */
class FilterChecker(filter: String) {
  def matches(content: String) = content contains filter

  def findMatchedFiles(iOObjects : List[IOObject]) =
    for (iOObject <- iOObjects
      if iOObject.isInstanceOf[FileObject]
      if matches(iOObject.name)
    ) yield iOObject
}

object FilterChecker
{
  def apply(filter: String): FilterChecker = new FilterChecker(filter)
}
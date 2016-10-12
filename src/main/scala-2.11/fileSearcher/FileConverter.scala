package fileSearcher

import java.io.File

/**
  * Created by Sean on 10/10/2016.
  */
object FileConverter {
  def convertToIOObject(file: File) =
    if(file.isDirectory()) DirectoryObject(file)
    else FileObject(file)
}

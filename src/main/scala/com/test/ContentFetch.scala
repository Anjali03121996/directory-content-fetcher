
package com.test

import java.io.File

sealed trait ContentFetch{
  def getFiles(folderName : File): List[File]
}
class A extends ContentFetch {
  override def getFiles(folderName: File): List[File] = {
      folderName.listFiles.filter(_.isDirectory).toList
  }
}


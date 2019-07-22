
package com.test

import java.io.File
import org.scalatest.FunSuite

class ContentFetchTest extends FunSuite{
  val a = new A
  test("Content Fetch Test") {
    val file = new File("/home/knoldus/GivenFolder")
    assert(a.getFiles(file)==file.listFiles().filter(_.isDirectory).toList)
  }
  test("Content fetch test 2"){
    val file1 = new File("/home/knoldus/GivenFolder/1")
    assert(a.getFiles(file1)==file1.listFiles().filter(_.isDirectory).toList)
  }
  test("Content fetch test 3"){
    val file2 = new File("/home/knoldus/GivenFolder/2")
    assert(a.getFiles(file2)==file2.listFiles().filter(_.isDirectory).toList)
  }
}

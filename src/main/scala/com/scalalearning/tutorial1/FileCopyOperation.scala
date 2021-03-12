package com.scalalearning.tutorial1
import java.nio.file.{Files, Paths, StandardCopyOption}
import java.io.File


object FileCopyOperation {
  def main(args: Array[String]): Unit = {
    val src_path="C:\\Users\\CRUX\\IdeaProjects\\scalalearning\\filecopyfolder\\staging" // Give your source directory
    val tgt_path="C:\\Users\\CRUX\\IdeaProjects\\scalalearning\\filecopyfolder\\final\\" // Give your target directory



    def getListOfDirectory(dir: String):List[File] = {
      val d = new File(dir)
      if (d.exists && d.isDirectory) {
        d.listFiles.filter(_.isDirectory).toList

      } else {
        List[File]()
      }
    }

    def getListOfFile(files: String):List[File] = {
      val d = new File(files)
      if (d.exists && d.isDirectory) {
        d.listFiles.filter(_.toString.toLowerCase().endsWith(".csv")).toList

      } else {
        List[File]()
      }
    }

    def copyRenameFile(source: String, destination: String): Unit = {

      val path = Files.copy(
        Paths.get(source),
        Paths.get(destination),
        StandardCopyOption.REPLACE_EXISTING
        //StandardCopyOption.ATOMIC_MOVE
      )
    }

    val DirectoryList= getListOfDirectory(src_path)
    println(DirectoryList)

    for ( dir <- DirectoryList){
      val FileList = getListOfFile(dir.toString)
      println(FileList)

      val index = dir.toString.lastIndexOf('\\');
      val FileName = dir.toString.substring(index +1) + ".csv"
      println(FileName)


      for( dir <- FileList){

        copyRenameFile( dir.toString, (tgt_path + "\\" + FileName ))
        println("copied " +dir+ " to "+ (tgt_path + "\\" + FileName ))
      }

    }







  }

}

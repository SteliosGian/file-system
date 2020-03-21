package scala.proj.commands

import apple.laf.JRSUIConstants.Direction

import scala.proj.files.{DirEntry, Directory}
import scala.proj.filesystem.State

class Mkdir(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    Directory.empty(state.wd.path, name)
}

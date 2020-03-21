package scala.proj.commands
import scala.proj.files.{DirEntry, File}
import scala.proj.filesystem.State

class Touch(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)
}

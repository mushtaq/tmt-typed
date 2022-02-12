package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystem extends StObject {
  
  /* standard DOM */
  val name: java.lang.String
  
  /* standard DOM */
  val root: FileSystemDirectoryEntry
}
object FileSystem {
  
  @scala.inline
  def apply(name: java.lang.String, root: FileSystemDirectoryEntry): FileSystem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystem]
  }
  
  @scala.inline
  implicit class FileSystemMutableBuilder[Self <: FileSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: FileSystemDirectoryEntry): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}

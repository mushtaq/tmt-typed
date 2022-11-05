package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemEntry extends StObject {
  
  /* standard DOM */
  val filesystem: FileSystem = js.native
  
  /* standard DOM */
  val fullPath: java.lang.String = js.native
  
  /* standard DOM */
  def getParent(): Unit = js.native
  def getParent(successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback): Unit = js.native
  def getParent(successCallback: FileSystemEntryCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /* standard DOM */
  val isDirectory: scala.Boolean = js.native
  
  /* standard DOM */
  val isFile: scala.Boolean = js.native
  
  /* standard DOM */
  val name: java.lang.String = js.native
}

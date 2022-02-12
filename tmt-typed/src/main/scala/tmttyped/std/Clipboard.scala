package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait Clipboard
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  def read(): js.Promise[ClipboardItems] = js.native
  
  /* standard DOM */
  def readText(): js.Promise[java.lang.String] = js.native
  
  /* standard DOM */
  def write(data: ClipboardItems): js.Promise[Unit] = js.native
  
  /* standard DOM */
  def writeText(data: java.lang.String): js.Promise[Unit] = js.native
}

package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about files and allows JavaScript in a web page to access their content. */
@js.native
trait File
  extends StObject
     with Blob {
  
  /* standard DOM */
  val lastModified: Double = js.native
  
  /* standard DOM */
  val name: java.lang.String = js.native
  
  /* standard DOM */
  val webkitRelativePath: java.lang.String = js.native
}

package tmttyped.node.childProcessMod

import tmttyped.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileOptionsWithStringEncoding extends ExecFileOptions {
  
  var encoding: BufferEncoding
}
object ExecFileOptionsWithStringEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): ExecFileOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileOptionsWithStringEncoding]
  }
  
  @scala.inline
  implicit class ExecFileOptionsWithStringEncodingMutableBuilder[Self <: ExecFileOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}

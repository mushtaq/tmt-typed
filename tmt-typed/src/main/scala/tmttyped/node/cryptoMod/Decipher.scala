package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import tmttyped.node.BufferEncoding
import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.nodeStreamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "Decipher")
@js.native
class Decipher protected () extends Transform {
  
  def `final`(): Buffer = js.native
  def `final`(output_encoding: BufferEncoding): String = js.native
  
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: Boolean): this.type = js.native
  
  def update(data: String, input_encoding: js.UndefOr[scala.Nothing], output_encoding: Encoding): String = js.native
  def update(data: String, input_encoding: Encoding): Buffer = js.native
  def update(data: String, input_encoding: Encoding, output_encoding: Encoding): String = js.native
  def update(data: ArrayBufferView): Buffer = js.native
  def update(data: ArrayBufferView, input_encoding: js.UndefOr[scala.Nothing], output_encoding: Encoding): String = js.native
}

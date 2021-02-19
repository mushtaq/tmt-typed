package tmttyped.node.cryptoMod

import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.nodeStreamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "Verify")
@js.native
class Verify_ protected () extends Writable {
  
  def update(data: String, input_encoding: Encoding): Verify_ = js.native
  def update(data: BinaryLike): Verify_ = js.native
  
  def verify(`object`: KeyLike, signature: String): Boolean = js.native
  def verify(`object`: KeyLike, signature: String, signature_format: BinaryToTextEncoding): Boolean = js.native
  def verify(`object`: KeyLike, signature: ArrayBufferView): Boolean = js.native
  def verify(`object`: VerifyKeyObjectInput, signature: String): Boolean = js.native
  def verify(`object`: VerifyKeyObjectInput, signature: String, signature_format: BinaryToTextEncoding): Boolean = js.native
  def verify(`object`: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = js.native
  def verify(`object`: VerifyPublicKeyInput, signature: String): Boolean = js.native
  def verify(`object`: VerifyPublicKeyInput, signature: String, signature_format: BinaryToTextEncoding): Boolean = js.native
  def verify(`object`: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = js.native
}

package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import tmttyped.node.nodeStreamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "Signer")
@js.native
class Signer protected () extends Writable {
  
  def sign(private_key: KeyLike): Buffer = js.native
  def sign(private_key: KeyLike, output_format: BinaryToTextEncoding): String = js.native
  def sign(private_key: SignKeyObjectInput): Buffer = js.native
  def sign(private_key: SignKeyObjectInput, output_format: BinaryToTextEncoding): String = js.native
  def sign(private_key: SignPrivateKeyInput): Buffer = js.native
  def sign(private_key: SignPrivateKeyInput, output_format: BinaryToTextEncoding): String = js.native
  
  def update(data: String, input_encoding: Encoding): Signer = js.native
  def update(data: BinaryLike): Signer = js.native
}

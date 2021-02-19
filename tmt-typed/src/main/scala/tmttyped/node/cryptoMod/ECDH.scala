package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.nodeStrings.base64
import tmttyped.node.nodeStrings.compressed
import tmttyped.node.nodeStrings.hex
import tmttyped.node.nodeStrings.hybrid
import tmttyped.node.nodeStrings.latin1
import tmttyped.node.nodeStrings.uncompressed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "ECDH")
@js.native
class ECDH protected () extends StObject {
  
  def computeSecret(other_public_key: String, input_encoding: BinaryToTextEncoding): Buffer = js.native
  def computeSecret(
    other_public_key: String,
    input_encoding: BinaryToTextEncoding,
    output_encoding: BinaryToTextEncoding
  ): String = js.native
  def computeSecret(other_public_key: ArrayBufferView): Buffer = js.native
  def computeSecret(other_public_key: ArrayBufferView, output_encoding: BinaryToTextEncoding): String = js.native
  
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: BinaryToTextEncoding): String = js.native
  def generateKeys(encoding: BinaryToTextEncoding, format: ECDHKeyFormat): String = js.native
  
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: BinaryToTextEncoding): String = js.native
  
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: BinaryToTextEncoding): String = js.native
  def getPublicKey(encoding: BinaryToTextEncoding, format: ECDHKeyFormat): String = js.native
  
  def setPrivateKey(private_key: String, encoding: BinaryToTextEncoding): Unit = js.native
  def setPrivateKey(private_key: ArrayBufferView): Unit = js.native
}
object ECDH {
  
  /* static member */
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(key: BinaryLike, curve: String): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(key: BinaryLike, curve: String, inputEncoding: BinaryToTextEncoding): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: base64): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: BinaryToTextEncoding, outputEncoding: base64): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_compressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: js.UndefOr[scala.Nothing],
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_compressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: js.UndefOr[scala.Nothing],
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: hex): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: BinaryToTextEncoding, outputEncoding: hex): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_hybrid(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: js.UndefOr[scala.Nothing],
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_hybrid(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: js.UndefOr[scala.Nothing],
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: latin1): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: BinaryToTextEncoding, outputEncoding: latin1): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_uncompressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: js.UndefOr[scala.Nothing],
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_uncompressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: js.UndefOr[scala.Nothing],
    format: uncompressed
  ): Buffer | String = js.native
}

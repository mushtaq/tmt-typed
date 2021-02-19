package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import tmttyped.node.BufferEncoding
import tmttyped.node.NodeJS.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "DiffieHellman")
@js.native
class DiffieHellman_ protected () extends StObject {
  
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
  
  def getGenerator(): Buffer = js.native
  def getGenerator(encoding: BinaryToTextEncoding): String = js.native
  
  def getPrime(): Buffer = js.native
  def getPrime(encoding: BinaryToTextEncoding): String = js.native
  
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: BinaryToTextEncoding): String = js.native
  
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: BinaryToTextEncoding): String = js.native
  
  def setPrivateKey(private_key: String, encoding: BufferEncoding): Unit = js.native
  def setPrivateKey(private_key: ArrayBufferView): Unit = js.native
  
  def setPublicKey(public_key: String, encoding: BufferEncoding): Unit = js.native
  def setPublicKey(public_key: ArrayBufferView): Unit = js.native
  
  var verifyError: Double = js.native
}

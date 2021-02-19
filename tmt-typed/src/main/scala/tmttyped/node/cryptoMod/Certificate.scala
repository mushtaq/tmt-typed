package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import tmttyped.node.NodeJS.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
  /**
    * @param spkac
    * @returns The challenge component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  def exportChallenge(spkac: BinaryLike): Buffer = js.native
  
  /**
    * @param spkac
    * @param encoding The encoding of the spkac string.
    * @returns The public key component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  def exportPublicKey(spkac: BinaryLike): Buffer = js.native
  def exportPublicKey(spkac: BinaryLike, encoding: String): Buffer = js.native
  
  /**
    * @param spkac
    * @returns `true` if the given `spkac` data structure is valid,
    * `false` otherwise.
    */
  def verifySpkac(spkac: ArrayBufferView): Boolean = js.native
}
/* Inlined node.crypto.Certificate & {new (): node.crypto.Certificate, None (): node.crypto.Certificate} */
object Certificate {
  
  /** @deprecated since v14.9.0 - Use static methods of `crypto.Certificate` instead. */
  @JSImport("crypto", "Certificate")
  @js.native
  def apply(): Certificate = js.native
  
  /**
    * @param spkac
    * @returns The challenge component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  @JSImport("crypto", "Certificate.exportChallenge")
  @js.native
  def exportChallenge(spkac: BinaryLike): Buffer = js.native
  
  /**
    * @param spkac
    * @param encoding The encoding of the spkac string.
    * @returns The public key component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  @JSImport("crypto", "Certificate.exportPublicKey")
  @js.native
  def exportPublicKey(spkac: BinaryLike): Buffer = js.native
  @JSImport("crypto", "Certificate.exportPublicKey")
  @js.native
  def exportPublicKey(spkac: BinaryLike, encoding: String): Buffer = js.native
  
  /**
    * @param spkac
    * @returns `true` if the given `spkac` data structure is valid,
    * `false` otherwise.
    */
  @JSImport("crypto", "Certificate.verifySpkac")
  @js.native
  def verifySpkac(spkac: ArrayBufferView): Boolean = js.native
}

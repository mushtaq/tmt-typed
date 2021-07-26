package tmttyped.node.cryptoMod

import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
  /**
    * @deprecated
    * @param spkac
    * @returns The challenge component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  def exportChallenge(spkac: BinaryLike): Buffer = js.native
  
  /**
    * @deprecated
    * @param spkac
    * @param encoding The encoding of the spkac string.
    * @returns The public key component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  def exportPublicKey(spkac: BinaryLike): Buffer = js.native
  def exportPublicKey(spkac: BinaryLike, encoding: String): Buffer = js.native
  
  /**
    * @deprecated
    * @param spkac
    * @returns `true` if the given `spkac` data structure is valid,
    * `false` otherwise.
    */
  def verifySpkac(spkac: ArrayBufferView): Boolean = js.native
}
/* Inlined node.crypto.Certificate & {new (): node.crypto.Certificate, None (): node.crypto.Certificate, exportChallenge (spkac : node.crypto.BinaryLike): node.buffer.<global>.Buffer, exportPublicKey (spkac : node.crypto.BinaryLike, encoding : string | undefined): node.buffer.<global>.Buffer, verifySpkac (spkac : node.NodeJS.ArrayBufferView): boolean} */
object Certificate {
  
  /** @deprecated since v14.9.0 - Use static methods of `crypto.Certificate` instead. */
  @scala.inline
  def apply(): Certificate = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Certificate]
  
  @JSImport("crypto", "Certificate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated
    * @param spkac
    * @returns The challenge component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  /**
    * @param spkac
    * @returns The challenge component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  @scala.inline
  def exportChallenge(spkac: BinaryLike): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("exportChallenge")(spkac.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * @deprecated
    * @param spkac
    * @param encoding The encoding of the spkac string.
    * @returns The public key component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  /**
    * @param spkac
    * @param encoding The encoding of the spkac string.
    * @returns The public key component of the `spkac` data structure,
    * which includes a public key and a challenge.
    */
  @scala.inline
  def exportPublicKey(spkac: BinaryLike): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPublicKey")(spkac.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def exportPublicKey(spkac: BinaryLike, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("exportPublicKey")(spkac.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * @deprecated
    * @param spkac
    * @returns `true` if the given `spkac` data structure is valid,
    * `false` otherwise.
    */
  /**
    * @param spkac
    * @returns `true` if the given `spkac` data structure is valid,
    * `false` otherwise.
    */
  @scala.inline
  def verifySpkac(spkac: ArrayBufferView): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifySpkac")(spkac.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

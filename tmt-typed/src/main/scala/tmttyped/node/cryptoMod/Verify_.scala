package tmttyped.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Verify` class is a utility for verifying signatures. It can be used in one
  * of two ways:
  *
  * * As a writable `stream` where written data is used to validate against the
  * supplied signature, or
  * * Using the `verify.update()` and `verify.verify()` methods to verify
  * the signature.
  *
  * The {@link createVerify} method is used to create `Verify` instances.`Verify` objects are not to be created directly using the `new` keyword.
  *
  * See `Sign` for examples.
  * @since v0.1.92
  */
@JSImport("crypto", "Verify")
@js.native
/* private */ open class Verify_ () extends StObject {
  
  def update(data: String, inputEncoding: Encoding): Verify_ = js.native
  /**
    * Updates the `Verify` content with the given `data`, the encoding of which
    * is given in `inputEncoding`.
    * If `inputEncoding` is not provided, and the `data` is a string, an
    * encoding of `'utf8'` is enforced. If `data` is a `Buffer`, `TypedArray`, or`DataView`, then `inputEncoding` is ignored.
    *
    * This can be called many times with new data as it is streamed.
    * @since v0.1.92
    * @param inputEncoding The `encoding` of the `data` string.
    */
  def update(data: BinaryLike): Verify_ = js.native
  
  def verify(`object`: KeyLike, signature: String): Boolean = js.native
  def verify(`object`: KeyLike, signature: String, signature_format: BinaryToTextEncoding): Boolean = js.native
  /**
    * Verifies the provided data using the given `object` and `signature`.
    *
    * If `object` is not a `KeyObject`, this function behaves as if`object` had been passed to {@link createPublicKey}. If it is an
    * object, the following additional properties can be passed:
    *
    * The `signature` argument is the previously calculated signature for the data, in
    * the `signatureEncoding`.
    * If a `signatureEncoding` is specified, the `signature` is expected to be a
    * string; otherwise `signature` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
    *
    * The `verify` object can not be used again after `verify.verify()` has been
    * called. Multiple calls to `verify.verify()` will result in an error being
    * thrown.
    *
    * Because public keys can be derived from private keys, a private key may
    * be passed instead of a public key.
    * @since v0.1.92
    */
  def verify(`object`: KeyLike, signature: js.typedarray.ArrayBufferView): Boolean = js.native
  def verify(`object`: VerifyKeyObjectInput, signature: String): Boolean = js.native
  def verify(`object`: VerifyKeyObjectInput, signature: String, signature_format: BinaryToTextEncoding): Boolean = js.native
  def verify(`object`: VerifyKeyObjectInput, signature: js.typedarray.ArrayBufferView): Boolean = js.native
  def verify(`object`: VerifyPublicKeyInput, signature: String): Boolean = js.native
  def verify(`object`: VerifyPublicKeyInput, signature: String, signature_format: BinaryToTextEncoding): Boolean = js.native
  def verify(`object`: VerifyPublicKeyInput, signature: js.typedarray.ArrayBufferView): Boolean = js.native
}

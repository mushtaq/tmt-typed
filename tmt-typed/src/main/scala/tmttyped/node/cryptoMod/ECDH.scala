package tmttyped.node.cryptoMod

import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.bufferMod.global.Buffer
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

/**
  * The `ECDH` class is a utility for creating Elliptic Curve Diffie-Hellman (ECDH)
  * key exchanges.
  *
  * Instances of the `ECDH` class can be created using the {@link createECDH} function.
  *
  * ```js
  * import assert from 'assert';
  *
  * const {
  *   createECDH,
  * } = await import('crypto');
  *
  * // Generate Alice's keys...
  * const alice = createECDH('secp521r1');
  * const aliceKey = alice.generateKeys();
  *
  * // Generate Bob's keys...
  * const bob = createECDH('secp521r1');
  * const bobKey = bob.generateKeys();
  *
  * // Exchange and generate the secret...
  * const aliceSecret = alice.computeSecret(bobKey);
  * const bobSecret = bob.computeSecret(aliceKey);
  *
  * assert.strictEqual(aliceSecret.toString('hex'), bobSecret.toString('hex'));
  * // OK
  * ```
  *
  * ```js
  * const assert = require('assert');
  *
  * const {
  *   createECDH,
  * } = require('crypto');
  *
  * // Generate Alice's keys...
  * const alice = createECDH('secp521r1');
  * const aliceKey = alice.generateKeys();
  *
  * // Generate Bob's keys...
  * const bob = createECDH('secp521r1');
  * const bobKey = bob.generateKeys();
  *
  * // Exchange and generate the secret...
  * const aliceSecret = alice.computeSecret(bobKey);
  * const bobSecret = bob.computeSecret(aliceKey);
  *
  * assert.strictEqual(aliceSecret.toString('hex'), bobSecret.toString('hex'));
  * // OK
  * ```
  * @since v0.11.14
  */
@JSImport("crypto", "ECDH")
@js.native
class ECDH protected () extends StObject {
  
  def computeSecret(other_public_key: String, input_encoding: BinaryToTextEncoding): Buffer = js.native
  def computeSecret(
    other_public_key: String,
    input_encoding: BinaryToTextEncoding,
    output_encoding: BinaryToTextEncoding
  ): String = js.native
  /**
    * Computes the shared secret using `otherPublicKey` as the other
    * party's public key and returns the computed shared secret. The supplied
    * key is interpreted using specified `inputEncoding`, and the returned secret
    * is encoded using the specified `outputEncoding`.
    * If the `inputEncoding` is not
    * provided, `otherPublicKey` is expected to be a `Buffer`, `TypedArray`, or`DataView`.
    *
    * If `outputEncoding` is given a string will be returned; otherwise a `Buffer` is returned.
    *
    * `ecdh.computeSecret` will throw an`ERR_CRYPTO_ECDH_INVALID_PUBLIC_KEY` error when `otherPublicKey`lies outside of the elliptic curve. Since `otherPublicKey` is
    * usually supplied from a remote user over an insecure network,
    * be sure to handle this exception accordingly.
    * @since v0.11.14
    * @param inputEncoding The `encoding` of the `otherPublicKey` string.
    * @param outputEncoding The `encoding` of the return value.
    */
  def computeSecret(other_public_key: ArrayBufferView): Buffer = js.native
  def computeSecret(other_public_key: ArrayBufferView, output_encoding: BinaryToTextEncoding): String = js.native
  
  /**
    * Generates private and public EC Diffie-Hellman key values, and returns
    * the public key in the specified `format` and `encoding`. This key should be
    * transferred to the other party.
    *
    * The `format` argument specifies point encoding and can be `'compressed'` or`'uncompressed'`. If `format` is not specified, the point will be returned in`'uncompressed'` format.
    *
    * If `encoding` is provided a string is returned; otherwise a `Buffer` is returned.
    * @since v0.11.14
    * @param encoding The `encoding` of the return value.
    */
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: BinaryToTextEncoding): String = js.native
  def generateKeys(encoding: BinaryToTextEncoding, format: ECDHKeyFormat): String = js.native
  
  /**
    * If `encoding` is specified, a string is returned; otherwise a `Buffer` is
    * returned.
    * @since v0.11.14
    * @param encoding The `encoding` of the return value.
    * @return The EC Diffie-Hellman in the specified `encoding`.
    */
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: BinaryToTextEncoding): String = js.native
  
  /**
    * The `format` argument specifies point encoding and can be `'compressed'` or`'uncompressed'`. If `format` is not specified the point will be returned in`'uncompressed'` format.
    *
    * If `encoding` is specified, a string is returned; otherwise a `Buffer` is
    * returned.
    * @since v0.11.14
    * @param encoding The `encoding` of the return value.
    * @return The EC Diffie-Hellman public key in the specified `encoding` and `format`.
    */
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: BinaryToTextEncoding): String = js.native
  def getPublicKey(encoding: BinaryToTextEncoding, format: ECDHKeyFormat): String = js.native
  
  def setPrivateKey(private_key: String, encoding: BinaryToTextEncoding): Unit = js.native
  /**
    * Sets the EC Diffie-Hellman private key.
    * If `encoding` is provided, `privateKey` is expected
    * to be a string; otherwise `privateKey` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
    *
    * If `privateKey` is not valid for the curve specified when the `ECDH` object was
    * created, an error is thrown. Upon setting the private key, the associated
    * public point (key) is also generated and set in the `ECDH` object.
    * @since v0.11.14
    * @param encoding The `encoding` of the `privateKey` string.
    */
  def setPrivateKey(private_key: ArrayBufferView): Unit = js.native
}
object ECDH {
  
  @JSImport("crypto", "ECDH")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the EC Diffie-Hellman public key specified by `key` and `curve` to the
    * format specified by `format`. The `format` argument specifies point encoding
    * and can be `'compressed'`, `'uncompressed'` or `'hybrid'`. The supplied key is
    * interpreted using the specified `inputEncoding`, and the returned key is encoded
    * using the specified `outputEncoding`.
    *
    * Use {@link getCurves} to obtain a list of available curve names.
    * On recent OpenSSL releases, `openssl ecparam -list_curves` will also display
    * the name and description of each available elliptic curve.
    *
    * If `format` is not specified the point will be returned in `'uncompressed'`format.
    *
    * If the `inputEncoding` is not provided, `key` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
    *
    * Example (uncompressing a key):
    *
    * ```js
    * const {
    *   createECDH,
    *   ECDH,
    * } = await import('crypto');
    *
    * const ecdh = createECDH('secp256k1');
    * ecdh.generateKeys();
    *
    * const compressedKey = ecdh.getPublicKey('hex', 'compressed');
    *
    * const uncompressedKey = ECDH.convertKey(compressedKey,
    *                                         'secp256k1',
    *                                         'hex',
    *                                         'hex',
    *                                         'uncompressed');
    *
    * // The converted key and the uncompressed public key should be the same
    * console.log(uncompressedKey === ecdh.getPublicKey('hex'));
    * ```
    *
    * ```js
    * const {
    *   createECDH,
    *   ECDH,
    * } = require('crypto');
    *
    * const ecdh = createECDH('secp256k1');
    * ecdh.generateKeys();
    *
    * const compressedKey = ecdh.getPublicKey('hex', 'compressed');
    *
    * const uncompressedKey = ECDH.convertKey(compressedKey,
    *                                         'secp256k1',
    *                                         'hex',
    *                                         'hex',
    *                                         'uncompressed');
    *
    * // The converted key and the uncompressed public key should be the same
    * console.log(uncompressedKey === ecdh.getPublicKey('hex'));
    * ```
    * @since v10.0.0
    * @param inputEncoding The `encoding` of the `key` string.
    * @param outputEncoding The `encoding` of the return value.
    */
  /* static member */
  @scala.inline
  def convertKey(key: BinaryLike, curve: String): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(key: BinaryLike, curve: String, inputEncoding: BinaryToTextEncoding): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  @scala.inline
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: BinaryToTextEncoding, outputEncoding: base64): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  @scala.inline
  def convertKey_compressed(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: Unit, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey_compressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: Unit,
    format: compressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  @scala.inline
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: BinaryToTextEncoding, outputEncoding: hex): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  @scala.inline
  def convertKey_hybrid(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: Unit, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey_hybrid(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: Unit,
    format: hybrid
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  @scala.inline
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: BinaryToTextEncoding, outputEncoding: latin1): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  @scala.inline
  def convertKey_uncompressed(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: Unit, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  @scala.inline
  def convertKey_uncompressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: BinaryToTextEncoding,
    outputEncoding: Unit,
    format: uncompressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
}

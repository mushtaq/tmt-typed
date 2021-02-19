package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cryptoMod {
  
  type BinaryLike = java.lang.String | tmttyped.node.NodeJS.ArrayBufferView
  
  type CipherKey = tmttyped.node.cryptoMod.BinaryLike | tmttyped.node.cryptoMod.KeyObject
  
  /** @deprecated since v10.0.0 */
  @scala.inline
  def DEFAULT_ENCODING: tmttyped.node.BufferEncoding = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_ENCODING").asInstanceOf[tmttyped.node.BufferEncoding]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - tmttyped.node.Buffer
    - tmttyped.node.cryptoMod.KeyObject
  */
  type KeyLike = tmttyped.node.cryptoMod._KeyLike | java.lang.String
  
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: java.lang.String, password: tmttyped.node.cryptoMod.BinaryLike): tmttyped.node.cryptoMod.Cipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipher(
    algorithm: java.lang.String,
    password: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.streamMod.TransformOptions
  ): tmttyped.node.cryptoMod.Cipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(
    algorithm: tmttyped.node.cryptoMod.CipherCCMTypes,
    password: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.cryptoMod.CipherCCMOptions
  ): tmttyped.node.cryptoMod.CipherCCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.CipherCCM]
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: tmttyped.node.cryptoMod.CipherGCMTypes, password: tmttyped.node.cryptoMod.BinaryLike): tmttyped.node.cryptoMod.CipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipher(
    algorithm: tmttyped.node.cryptoMod.CipherGCMTypes,
    password: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.cryptoMod.CipherGCMOptions
  ): tmttyped.node.cryptoMod.CipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.CipherGCM]
  
  @scala.inline
  def createCipheriv(algorithm: java.lang.String, key: tmttyped.node.cryptoMod.CipherKey): tmttyped.node.cryptoMod.Cipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: java.lang.String,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: tmttyped.node.streamMod.TransformOptions
  ): tmttyped.node.cryptoMod.Cipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: java.lang.String,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike
  ): tmttyped.node.cryptoMod.Cipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: java.lang.String,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.streamMod.TransformOptions
  ): tmttyped.node.cryptoMod.Cipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherCCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: tmttyped.node.cryptoMod.CipherCCMOptions
  ): tmttyped.node.cryptoMod.CipherCCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.CipherCCM]
  @scala.inline
  def createCipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherCCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.cryptoMod.CipherCCMOptions
  ): tmttyped.node.cryptoMod.CipherCCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.CipherCCM]
  @scala.inline
  def createCipheriv(algorithm: tmttyped.node.cryptoMod.CipherGCMTypes, key: tmttyped.node.cryptoMod.CipherKey): tmttyped.node.cryptoMod.CipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherGCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: tmttyped.node.cryptoMod.CipherGCMOptions
  ): tmttyped.node.cryptoMod.CipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherGCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike
  ): tmttyped.node.cryptoMod.CipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherGCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.cryptoMod.CipherGCMOptions
  ): tmttyped.node.cryptoMod.CipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.CipherGCM]
  
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: java.lang.String, password: tmttyped.node.cryptoMod.BinaryLike): tmttyped.node.cryptoMod.Decipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipher(
    algorithm: java.lang.String,
    password: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.streamMod.TransformOptions
  ): tmttyped.node.cryptoMod.Decipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(
    algorithm: tmttyped.node.cryptoMod.CipherCCMTypes,
    password: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.cryptoMod.CipherCCMOptions
  ): tmttyped.node.cryptoMod.DecipherCCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DecipherCCM]
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: tmttyped.node.cryptoMod.CipherGCMTypes, password: tmttyped.node.cryptoMod.BinaryLike): tmttyped.node.cryptoMod.DecipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipher(
    algorithm: tmttyped.node.cryptoMod.CipherGCMTypes,
    password: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.cryptoMod.CipherGCMOptions
  ): tmttyped.node.cryptoMod.DecipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DecipherGCM]
  
  @scala.inline
  def createDecipheriv(algorithm: java.lang.String, key: tmttyped.node.cryptoMod.CipherKey): tmttyped.node.cryptoMod.Decipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: java.lang.String,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: tmttyped.node.streamMod.TransformOptions
  ): tmttyped.node.cryptoMod.Decipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: java.lang.String,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike
  ): tmttyped.node.cryptoMod.Decipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: java.lang.String,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.streamMod.TransformOptions
  ): tmttyped.node.cryptoMod.Decipher = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherCCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: tmttyped.node.cryptoMod.CipherCCMOptions
  ): tmttyped.node.cryptoMod.DecipherCCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DecipherCCM]
  @scala.inline
  def createDecipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherCCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.cryptoMod.CipherCCMOptions
  ): tmttyped.node.cryptoMod.DecipherCCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DecipherCCM]
  @scala.inline
  def createDecipheriv(algorithm: tmttyped.node.cryptoMod.CipherGCMTypes, key: tmttyped.node.cryptoMod.CipherKey): tmttyped.node.cryptoMod.DecipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherGCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: tmttyped.node.cryptoMod.CipherGCMOptions
  ): tmttyped.node.cryptoMod.DecipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherGCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike
  ): tmttyped.node.cryptoMod.DecipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipheriv(
    algorithm: tmttyped.node.cryptoMod.CipherGCMTypes,
    key: tmttyped.node.cryptoMod.CipherKey,
    iv: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.cryptoMod.CipherGCMOptions
  ): tmttyped.node.cryptoMod.DecipherGCM = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DecipherGCM]
  
  @scala.inline
  def createDiffieHellman(prime_length: scala.Double): tmttyped.node.cryptoMod.DiffieHellman_ = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): tmttyped.node.cryptoMod.DiffieHellman_ = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: scala.Double, generator: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.cryptoMod.DiffieHellman_ = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: java.lang.String, prime_encoding: tmttyped.node.cryptoMod.BinaryToTextEncoding): tmttyped.node.cryptoMod.DiffieHellman_ = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: tmttyped.node.cryptoMod.BinaryToTextEncoding,
    generator: java.lang.String,
    generator_encoding: tmttyped.node.cryptoMod.BinaryToTextEncoding
  ): tmttyped.node.cryptoMod.DiffieHellman_ = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generator_encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: tmttyped.node.cryptoMod.BinaryToTextEncoding,
    generator: scala.Double
  ): tmttyped.node.cryptoMod.DiffieHellman_ = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: tmttyped.node.cryptoMod.BinaryToTextEncoding,
    generator: tmttyped.node.NodeJS.ArrayBufferView
  ): tmttyped.node.cryptoMod.DiffieHellman_ = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.cryptoMod.DiffieHellman_ = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  
  @scala.inline
  def createECDH(curve_name: java.lang.String): tmttyped.node.cryptoMod.ECDH = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createECDH")(curve_name.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.ECDH]
  
  @scala.inline
  def createHash(algorithm: java.lang.String): tmttyped.node.cryptoMod.Hash = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.Hash]
  @scala.inline
  def createHash(algorithm: java.lang.String, options: tmttyped.node.cryptoMod.HashOptions): tmttyped.node.cryptoMod.Hash = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hash]
  
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: tmttyped.node.cryptoMod.BinaryLike): tmttyped.node.cryptoMod.Hmac = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(
    algorithm: java.lang.String,
    key: tmttyped.node.cryptoMod.BinaryLike,
    options: tmttyped.node.streamMod.TransformOptions
  ): tmttyped.node.cryptoMod.Hmac = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: tmttyped.node.cryptoMod.KeyObject): tmttyped.node.cryptoMod.Hmac = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(
    algorithm: java.lang.String,
    key: tmttyped.node.cryptoMod.KeyObject,
    options: tmttyped.node.streamMod.TransformOptions
  ): tmttyped.node.cryptoMod.Hmac = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hmac]
  
  @scala.inline
  def createPrivateKey(key: java.lang.String): tmttyped.node.cryptoMod.KeyObject = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: tmttyped.node.Buffer): tmttyped.node.cryptoMod.KeyObject = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: tmttyped.node.cryptoMod.PrivateKeyInput): tmttyped.node.cryptoMod.KeyObject = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createPublicKey(key: java.lang.String): tmttyped.node.cryptoMod.KeyObject = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: tmttyped.node.Buffer): tmttyped.node.cryptoMod.KeyObject = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: tmttyped.node.cryptoMod.KeyObject): tmttyped.node.cryptoMod.KeyObject = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: tmttyped.node.cryptoMod.PublicKeyInput): tmttyped.node.cryptoMod.KeyObject = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createSecretKey(key: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.cryptoMod.KeyObject = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecretKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createSign(algorithm: java.lang.String): tmttyped.node.cryptoMod.Signer = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.Signer]
  @scala.inline
  def createSign(algorithm: java.lang.String, options: tmttyped.node.streamMod.WritableOptions): tmttyped.node.cryptoMod.Signer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Signer]
  
  @scala.inline
  def createVerify(algorithm: java.lang.String): tmttyped.node.cryptoMod.Verify_ = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.Verify_]
  @scala.inline
  def createVerify(algorithm: java.lang.String, options: tmttyped.node.streamMod.WritableOptions): tmttyped.node.cryptoMod.Verify_ = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Verify_]
  
  /**
    * Computes the Diffie-Hellman secret based on a privateKey and a publicKey.
    * Both keys must have the same asymmetricKeyType, which must be one of
    * 'dh' (for Diffie-Hellman), 'ec' (for ECDH), 'x448', or 'x25519' (for ECDH-ES).
    */
  @scala.inline
  def diffieHellman(options: tmttyped.node.anon.PrivateKey): tmttyped.node.Buffer = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("diffieHellman")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
  
  /** @deprecated since v10.0.0 */
  @scala.inline
  def fips: scala.Boolean = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].selectDynamic("fips").asInstanceOf[scala.Boolean]
  
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.dsa,
    options: tmttyped.node.cryptoMod.DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.dsa,
    options: tmttyped.node.cryptoMod.DSAKeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ tmttyped.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ tmttyped.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.ec,
    options: tmttyped.node.cryptoMod.ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.ec,
    options: tmttyped.node.cryptoMod.ECKeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ tmttyped.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ tmttyped.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.ed25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.ed25519,
    options: tmttyped.node.cryptoMod.ED25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.ed25519,
    options: tmttyped.node.cryptoMod.ED25519KeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ tmttyped.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ tmttyped.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.ed448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.ed448,
    options: tmttyped.node.cryptoMod.ED448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.ed448,
    options: tmttyped.node.cryptoMod.ED448KeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ tmttyped.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ tmttyped.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.rsa,
    options: tmttyped.node.cryptoMod.RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.rsa,
    options: tmttyped.node.cryptoMod.RSAKeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ tmttyped.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ tmttyped.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.x25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.x25519,
    options: tmttyped.node.cryptoMod.X25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.x25519,
    options: tmttyped.node.cryptoMod.X25519KeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ tmttyped.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ tmttyped.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.x448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.x448,
    options: tmttyped.node.cryptoMod.X448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: tmttyped.node.nodeStrings.x448,
    options: tmttyped.node.cryptoMod.X448KeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ tmttyped.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ tmttyped.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def generateKeyPairSync(
    `type`: tmttyped.node.nodeStrings.dsa,
    options: tmttyped.node.cryptoMod.DSAKeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ]
  ): tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: tmttyped.node.nodeStrings.ec,
    options: tmttyped.node.cryptoMod.ECKeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ]
  ): tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: tmttyped.node.nodeStrings.ed25519,
    options: tmttyped.node.cryptoMod.ED25519KeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ]
  ): tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: tmttyped.node.nodeStrings.ed448,
    options: tmttyped.node.cryptoMod.ED448KeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ]
  ): tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: tmttyped.node.nodeStrings.rsa,
    options: tmttyped.node.cryptoMod.RSAKeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ]
  ): tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: tmttyped.node.nodeStrings.x25519,
    options: tmttyped.node.cryptoMod.X25519KeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ]
  ): tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: tmttyped.node.nodeStrings.x448,
    options: tmttyped.node.cryptoMod.X448KeyPairOptions[
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem, 
      tmttyped.node.nodeStrings.der | tmttyped.node.nodeStrings.pem
    ]
  ): tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  
  @scala.inline
  def generateKeyPairSync_dsa(`type`: tmttyped.node.nodeStrings.dsa, options: tmttyped.node.cryptoMod.DSAKeyPairKeyObjectOptions): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ec(`type`: tmttyped.node.nodeStrings.ec, options: tmttyped.node.cryptoMod.ECKeyPairKeyObjectOptions): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed25519(`type`: tmttyped.node.nodeStrings.ed25519): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed25519(
    `type`: tmttyped.node.nodeStrings.ed25519,
    options: tmttyped.node.cryptoMod.ED25519KeyPairKeyObjectOptions
  ): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed448(`type`: tmttyped.node.nodeStrings.ed448): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed448(
    `type`: tmttyped.node.nodeStrings.ed448,
    options: tmttyped.node.cryptoMod.ED448KeyPairKeyObjectOptions
  ): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_rsa(`type`: tmttyped.node.nodeStrings.rsa, options: tmttyped.node.cryptoMod.RSAKeyPairKeyObjectOptions): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x25519(`type`: tmttyped.node.nodeStrings.x25519): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x25519(
    `type`: tmttyped.node.nodeStrings.x25519,
    options: tmttyped.node.cryptoMod.X25519KeyPairKeyObjectOptions
  ): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x448(`type`: tmttyped.node.nodeStrings.x448): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x448(
    `type`: tmttyped.node.nodeStrings.x448,
    options: tmttyped.node.cryptoMod.X448KeyPairKeyObjectOptions
  ): tmttyped.node.cryptoMod.KeyPairKeyObjectResult = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def getCiphers(): js.Array[java.lang.String] = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getCurves(): js.Array[java.lang.String] = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurves")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getDiffieHellman(group_name: java.lang.String): tmttyped.node.cryptoMod.DiffieHellman_ = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(group_name.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  
  @scala.inline
  def getFips(): tmttyped.node.nodeNumbers.`1` | tmttyped.node.nodeNumbers.`0` = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFips")().asInstanceOf[tmttyped.node.nodeNumbers.`1` | tmttyped.node.nodeNumbers.`0`]
  
  @scala.inline
  def getHashes(): js.Array[java.lang.String] = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getHashes")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def pbkdf2(
    password: tmttyped.node.cryptoMod.BinaryLike,
    salt: tmttyped.node.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* derivedKey */ tmttyped.node.Buffer, _]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def pbkdf2Sync(
    password: tmttyped.node.cryptoMod.BinaryLike,
    salt: tmttyped.node.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def privateDecrypt(private_key: tmttyped.node.cryptoMod.KeyLike, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def privateDecrypt(private_key: tmttyped.node.cryptoMod.RsaPrivateKey, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def privateEncrypt(private_key: tmttyped.node.cryptoMod.KeyLike, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def privateEncrypt(private_key: tmttyped.node.cryptoMod.RsaPrivateKey, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def pseudoRandomBytes(size: scala.Double): tmttyped.node.Buffer = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ tmttyped.node.Buffer, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def publicDecrypt(key: tmttyped.node.cryptoMod.KeyLike, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def publicDecrypt(key: tmttyped.node.cryptoMod.RsaPrivateKey, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def publicDecrypt(key: tmttyped.node.cryptoMod.RsaPublicKey, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def publicEncrypt(key: tmttyped.node.cryptoMod.KeyLike, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def publicEncrypt(key: tmttyped.node.cryptoMod.RsaPrivateKey, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def publicEncrypt(key: tmttyped.node.cryptoMod.RsaPublicKey, buffer: tmttyped.node.NodeJS.ArrayBufferView): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def randomBytes(size: scala.Double): tmttyped.node.Buffer = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ tmttyped.node.Buffer, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def randomFill(
    buffer: js.typedarray.DataView,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.DataView, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.DataView, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.DataView, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float32Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float32Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float32Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float32Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float64Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float64Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float64Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float64Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int16Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int16Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int16Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int16Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int32Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int32Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int32Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int32Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int8Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int8Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int8Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int8Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint16Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint16Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint16Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint32Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint32Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint32Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint8Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint8Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint8Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    callback: js.Function2[
      /* err */ js.Error | scala.Null, 
      /* buf */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ js.Error | scala.Null, 
      /* buf */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ js.Error | scala.Null, 
      /* buf */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: tmttyped.std.BigInt64Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ tmttyped.std.BigInt64Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ tmttyped.std.BigInt64Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ tmttyped.std.BigInt64Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: tmttyped.std.BigUint64Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ tmttyped.std.BigUint64Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ tmttyped.std.BigUint64Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ tmttyped.std.BigUint64Array, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView): js.typedarray.DataView = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.DataView = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView, offset: scala.Double): js.typedarray.DataView = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView, offset: scala.Double, size: scala.Double): js.typedarray.DataView = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array): js.typedarray.Float32Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Float32Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: scala.Double): js.typedarray.Float32Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: scala.Double, size: scala.Double): js.typedarray.Float32Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array): js.typedarray.Float64Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Float64Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: scala.Double): js.typedarray.Float64Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: scala.Double, size: scala.Double): js.typedarray.Float64Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array): js.typedarray.Int16Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Int16Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: scala.Double): js.typedarray.Int16Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: scala.Double, size: scala.Double): js.typedarray.Int16Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array): js.typedarray.Int32Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Int32Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: scala.Double): js.typedarray.Int32Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: scala.Double, size: scala.Double): js.typedarray.Int32Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array): js.typedarray.Int8Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Int8Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: scala.Double): js.typedarray.Int8Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: scala.Double, size: scala.Double): js.typedarray.Int8Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array): js.typedarray.Uint16Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Uint16Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: scala.Double): js.typedarray.Uint16Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: scala.Double, size: scala.Double): js.typedarray.Uint16Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array): js.typedarray.Uint32Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Uint32Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: scala.Double): js.typedarray.Uint32Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: scala.Double, size: scala.Double): js.typedarray.Uint32Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Uint8Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: scala.Double): js.typedarray.Uint8Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: scala.Double, size: scala.Double): js.typedarray.Uint8Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Uint8ClampedArray = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: scala.Double): js.typedarray.Uint8ClampedArray = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: scala.Double, size: scala.Double): js.typedarray.Uint8ClampedArray = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: tmttyped.std.BigInt64Array): tmttyped.std.BigInt64Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[tmttyped.std.BigInt64Array]
  @scala.inline
  def randomFillSync(buffer: tmttyped.std.BigInt64Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): tmttyped.std.BigInt64Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[tmttyped.std.BigInt64Array]
  @scala.inline
  def randomFillSync(buffer: tmttyped.std.BigInt64Array, offset: scala.Double): tmttyped.std.BigInt64Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[tmttyped.std.BigInt64Array]
  @scala.inline
  def randomFillSync(buffer: tmttyped.std.BigInt64Array, offset: scala.Double, size: scala.Double): tmttyped.std.BigInt64Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[tmttyped.std.BigInt64Array]
  @scala.inline
  def randomFillSync(buffer: tmttyped.std.BigUint64Array): tmttyped.std.BigUint64Array = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[tmttyped.std.BigUint64Array]
  @scala.inline
  def randomFillSync(buffer: tmttyped.std.BigUint64Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): tmttyped.std.BigUint64Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[tmttyped.std.BigUint64Array]
  @scala.inline
  def randomFillSync(buffer: tmttyped.std.BigUint64Array, offset: scala.Double): tmttyped.std.BigUint64Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[tmttyped.std.BigUint64Array]
  @scala.inline
  def randomFillSync(buffer: tmttyped.std.BigUint64Array, offset: scala.Double, size: scala.Double): tmttyped.std.BigUint64Array = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[tmttyped.std.BigUint64Array]
  
  @scala.inline
  def randomInt(max: scala.Double): scala.Double = tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def randomInt(
    max: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomInt(min: scala.Double, max: scala.Double): scala.Double = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def randomInt(
    min: scala.Double,
    max: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def scrypt(
    password: tmttyped.node.cryptoMod.BinaryLike,
    salt: tmttyped.node.cryptoMod.BinaryLike,
    keylen: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* derivedKey */ tmttyped.node.Buffer, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def scrypt(
    password: tmttyped.node.cryptoMod.BinaryLike,
    salt: tmttyped.node.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: tmttyped.node.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* derivedKey */ tmttyped.node.Buffer, scala.Unit]
  ): scala.Unit = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def scryptSync(
    password: tmttyped.node.cryptoMod.BinaryLike,
    salt: tmttyped.node.cryptoMod.BinaryLike,
    keylen: scala.Double
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def scryptSync(
    password: tmttyped.node.cryptoMod.BinaryLike,
    salt: tmttyped.node.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: tmttyped.node.cryptoMod.ScryptOptions
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.KeyLike
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.SignKeyObjectInput
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.SignPrivateKeyInput
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.KeyLike
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.SignKeyObjectInput
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.SignPrivateKeyInput
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def sign(
    algorithm: scala.Null,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.KeyLike
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def sign(
    algorithm: scala.Null,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.SignKeyObjectInput
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def sign(
    algorithm: scala.Null,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.SignPrivateKeyInput
  ): tmttyped.node.Buffer = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def timingSafeEqual(a: tmttyped.node.NodeJS.ArrayBufferView, b: tmttyped.node.NodeJS.ArrayBufferView): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("timingSafeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.KeyLike,
    signature: tmttyped.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.VerifyKeyObjectInput,
    signature: tmttyped.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.VerifyPublicKeyInput,
    signature: tmttyped.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.KeyLike,
    signature: tmttyped.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.VerifyKeyObjectInput,
    signature: tmttyped.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.VerifyPublicKeyInput,
    signature: tmttyped.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: scala.Null,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.KeyLike,
    signature: tmttyped.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: scala.Null,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.VerifyKeyObjectInput,
    signature: tmttyped.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: scala.Null,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    key: tmttyped.node.cryptoMod.VerifyPublicKeyInput,
    signature: tmttyped.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (tmttyped.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}

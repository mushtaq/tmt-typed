package tmttyped.std

import tmttyped.std.stdStrings.jwk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Web Crypto API interface provides a number of low-level cryptographic functions. It is accessed via the Crypto.subtle properties available in a window context (via Window.crypto).
  * Available only in secure contexts.
  */
@js.native
trait SubtleCrypto extends StObject {
  
  def decrypt(algorithm: org.scalajs.dom.AesCbcParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  def decrypt(algorithm: org.scalajs.dom.AesCtrParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  def decrypt(algorithm: org.scalajs.dom.AesGcmParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  def decrypt(algorithm: org.scalajs.dom.RsaOaepParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  /* standard DOM */
  def decrypt(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  
  def deriveBits(algorithm: org.scalajs.dom.EcdhKeyDeriveParams, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: org.scalajs.dom.Pbkdf2Params, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /* standard DOM */
  def deriveBits(algorithm: AlgorithmIdentifier, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfParams, baseKey: org.scalajs.dom.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard DOM */
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard DOM.Iterable */
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  
  /* standard DOM */
  def digest(algorithm: AlgorithmIdentifier, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def encrypt(algorithm: org.scalajs.dom.AesCbcParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  def encrypt(algorithm: org.scalajs.dom.AesCtrParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  def encrypt(algorithm: org.scalajs.dom.AesGcmParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  def encrypt(algorithm: org.scalajs.dom.RsaOaepParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  /* standard DOM */
  def encrypt(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[Any] = js.native
  
  /* standard DOM */
  @JSName("exportKey")
  def exportKey_jwk(format: Exclude[org.scalajs.dom.KeyFormat, jwk], key: org.scalajs.dom.CryptoKey): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /* standard DOM */
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: org.scalajs.dom.CryptoKey): js.Promise[org.scalajs.dom.JsonWebKey] = js.native
  
  /* standard DOM.Iterable */
  def generateKey(
    algorithm: org.scalajs.dom.AesKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.EcKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKeyPair] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.HmacKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard DOM.Iterable */
  def generateKey(
    algorithm: org.scalajs.dom.RsaHashedKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKeyPair] = js.native
  /* standard DOM */
  def generateKey(
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKeyPair | org.scalajs.dom.CryptoKey] = js.native
  /* standard DOM.Iterable */
  def generateKey(
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKeyPair | org.scalajs.dom.CryptoKey] = js.native
  
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard DOM */
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard DOM.Iterable */
  @JSName("importKey")
  def importKey_jwk(
    format: Exclude[org.scalajs.dom.KeyFormat, jwk],
    keyData: BufferSource,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard DOM.Iterable */
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.JsonWebKey,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  
  def sign(algorithm: org.scalajs.dom.EcdsaParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: org.scalajs.dom.RsaPssParams, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /* standard DOM */
  def sign(algorithm: AlgorithmIdentifier, key: org.scalajs.dom.CryptoKey, data: BufferSource): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCbcParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesCtrParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.AesGcmParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: org.scalajs.dom.RsaOaepParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: org.scalajs.dom.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: org.scalajs.dom.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: org.scalajs.dom.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: org.scalajs.dom.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard DOM */
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  /* standard DOM.Iterable */
  def unwrapKey(
    format: org.scalajs.dom.KeyFormat,
    wrappedKey: BufferSource,
    unwrappingKey: org.scalajs.dom.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Iterable[org.scalajs.dom.KeyUsage]
  ): js.Promise[org.scalajs.dom.CryptoKey] = js.native
  
  def verify(
    algorithm: org.scalajs.dom.EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    signature: BufferSource,
    data: BufferSource
  ): js.Promise[scala.Boolean] = js.native
  def verify(
    algorithm: org.scalajs.dom.RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    signature: BufferSource,
    data: BufferSource
  ): js.Promise[scala.Boolean] = js.native
  /* standard DOM */
  def verify(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.CryptoKey,
    signature: BufferSource,
    data: BufferSource
  ): js.Promise[scala.Boolean] = js.native
  
  def wrapKey(
    format: org.scalajs.dom.KeyFormat,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCbcParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: org.scalajs.dom.KeyFormat,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesCtrParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: org.scalajs.dom.KeyFormat,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.AesGcmParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: org.scalajs.dom.KeyFormat,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.RsaOaepParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  /* standard DOM */
  def wrapKey(
    format: org.scalajs.dom.KeyFormat,
    key: org.scalajs.dom.CryptoKey,
    wrappingKey: org.scalajs.dom.CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
}

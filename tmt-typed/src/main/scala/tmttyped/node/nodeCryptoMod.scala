package tmttyped.node

import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.anon.Length
import tmttyped.node.anon.PrivateKey
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.cryptoMod.BinaryLike
import tmttyped.node.cryptoMod.BinaryToTextEncoding
import tmttyped.node.cryptoMod.Certificate
import tmttyped.node.cryptoMod.CheckPrimeOptions
import tmttyped.node.cryptoMod.CipherCCM
import tmttyped.node.cryptoMod.CipherCCMOptions
import tmttyped.node.cryptoMod.CipherCCMTypes
import tmttyped.node.cryptoMod.CipherGCM
import tmttyped.node.cryptoMod.CipherGCMOptions
import tmttyped.node.cryptoMod.CipherGCMTypes
import tmttyped.node.cryptoMod.CipherInfo
import tmttyped.node.cryptoMod.CipherInfoOptions
import tmttyped.node.cryptoMod.CipherKey
import tmttyped.node.cryptoMod.DSAKeyPairKeyObjectOptions
import tmttyped.node.cryptoMod.DSAKeyPairOptions
import tmttyped.node.cryptoMod.DecipherCCM
import tmttyped.node.cryptoMod.DecipherGCM
import tmttyped.node.cryptoMod.ECKeyPairKeyObjectOptions
import tmttyped.node.cryptoMod.ECKeyPairOptions
import tmttyped.node.cryptoMod.ED25519KeyPairKeyObjectOptions
import tmttyped.node.cryptoMod.ED25519KeyPairOptions
import tmttyped.node.cryptoMod.ED448KeyPairKeyObjectOptions
import tmttyped.node.cryptoMod.ED448KeyPairOptions
import tmttyped.node.cryptoMod.GeneratePrimeOptions
import tmttyped.node.cryptoMod.GeneratePrimeOptionsArrayBuffer
import tmttyped.node.cryptoMod.GeneratePrimeOptionsBigInt
import tmttyped.node.cryptoMod.HashOptions
import tmttyped.node.cryptoMod.JsonWebKeyInput
import tmttyped.node.cryptoMod.KeyLike
import tmttyped.node.cryptoMod.KeyPairKeyObjectResult
import tmttyped.node.cryptoMod.KeyPairSyncResult
import tmttyped.node.cryptoMod.LargeNumberLike
import tmttyped.node.cryptoMod.PrivateKeyInput
import tmttyped.node.cryptoMod.PublicKeyInput
import tmttyped.node.cryptoMod.RSAKeyPairKeyObjectOptions
import tmttyped.node.cryptoMod.RSAKeyPairOptions
import tmttyped.node.cryptoMod.RandomUUIDOptions
import tmttyped.node.cryptoMod.RsaPrivateKey
import tmttyped.node.cryptoMod.RsaPublicKey
import tmttyped.node.cryptoMod.ScryptOptions
import tmttyped.node.cryptoMod.SecureHeapUsage
import tmttyped.node.cryptoMod.SignKeyObjectInput
import tmttyped.node.cryptoMod.SignPrivateKeyInput
import tmttyped.node.cryptoMod.VerifyKeyObjectInput
import tmttyped.node.cryptoMod.VerifyPublicKeyInput
import tmttyped.node.cryptoMod.X25519KeyPairKeyObjectOptions
import tmttyped.node.cryptoMod.X25519KeyPairOptions
import tmttyped.node.cryptoMod.X448KeyPairKeyObjectOptions
import tmttyped.node.cryptoMod.X448KeyPairOptions
import tmttyped.node.nodeNumbers.`0`
import tmttyped.node.nodeNumbers.`1`
import tmttyped.node.nodeStrings.aes
import tmttyped.node.nodeStrings.base64
import tmttyped.node.nodeStrings.compressed
import tmttyped.node.nodeStrings.der
import tmttyped.node.nodeStrings.dsa
import tmttyped.node.nodeStrings.ec
import tmttyped.node.nodeStrings.ed25519
import tmttyped.node.nodeStrings.ed448
import tmttyped.node.nodeStrings.hex
import tmttyped.node.nodeStrings.hmac
import tmttyped.node.nodeStrings.hybrid
import tmttyped.node.nodeStrings.latin1
import tmttyped.node.nodeStrings.pem
import tmttyped.node.nodeStrings.rsa
import tmttyped.node.nodeStrings.uncompressed
import tmttyped.node.nodeStrings.x25519
import tmttyped.node.nodeStrings.x448
import tmttyped.node.streamMod.TransformOptions
import tmttyped.node.streamMod.WritableOptions
import tmttyped.node.workerThreadsMod._TransferListItem
import tmttyped.std.BigInt64Array
import tmttyped.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeCryptoMod {
  
  @JSImport("node:crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined node.crypto.Certificate & {new (): node.crypto.Certificate, None (): node.crypto.Certificate, exportChallenge (spkac : node.crypto.BinaryLike): node.buffer.<global>.Buffer, exportPublicKey (spkac : node.crypto.BinaryLike, encoding : string | undefined): node.buffer.<global>.Buffer, verifySpkac (spkac : node.NodeJS.ArrayBufferView): boolean} */
  object Certificate {
    
    /** @deprecated since v14.9.0 - Use static methods of `crypto.Certificate` instead. */
    @scala.inline
    def apply(): tmttyped.node.cryptoMod.Certificate = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[tmttyped.node.cryptoMod.Certificate]
    
    @JSImport("node:crypto", "Certificate")
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
    def exportPublicKey(spkac: BinaryLike, encoding: java.lang.String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("exportPublicKey")(spkac.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:crypto", "Certificate")
  @js.native
  /** @deprecated since v14.9.0 - Use static methods of `crypto.Certificate` instead. */
  class CertificateCls ()
    extends StObject
       with Certificate
  
  /**
    * * Extends: `<stream.Transform>`
    *
    * Instances of the `Cipher` class are used to encrypt data. The class can be
    * used in one of two ways:
    *
    * * As a `stream` that is both readable and writable, where plain unencrypted
    * data is written to produce encrypted data on the readable side, or
    * * Using the `cipher.update()` and `cipher.final()` methods to produce
    * the encrypted data.
    *
    * The {@link createCipher} or {@link createCipheriv} methods are
    * used to create `Cipher` instances. `Cipher` objects are not to be created
    * directly using the `new` keyword.
    *
    * Example: Using `Cipher` objects as streams:
    *
    * ```js
    * const {
    *   scrypt,
    *   randomFill,
    *   createCipheriv
    * } = await import('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    *
    * // First, we'll generate the key. The key length is dependent on the algorithm.
    * // In this case for aes192, it is 24 bytes (192 bits).
    * scrypt(password, 'salt', 24, (err, key) => {
    *   if (err) throw err;
    *   // Then, we'll generate a random initialization vector
    *   randomFill(new Uint8Array(16), (err, iv) => {
    *     if (err) throw err;
    *
    *     // Once we have the key and iv, we can create and use the cipher...
    *     const cipher = createCipheriv(algorithm, key, iv);
    *
    *     let encrypted = '';
    *     cipher.setEncoding('hex');
    *
    *     cipher.on('data', (chunk) => encrypted += chunk);
    *     cipher.on('end', () => console.log(encrypted));
    *
    *     cipher.write('some clear text data');
    *     cipher.end();
    *   });
    * });
    * ```
    *
    * ```js
    * const {
    *   scrypt,
    *   randomFill,
    *   createCipheriv
    * } = require('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    *
    * // First, we'll generate the key. The key length is dependent on the algorithm.
    * // In this case for aes192, it is 24 bytes (192 bits).
    * scrypt(password, 'salt', 24, (err, key) => {
    *   if (err) throw err;
    *   // Then, we'll generate a random initialization vector
    *   randomFill(new Uint8Array(16), (err, iv) => {
    *     if (err) throw err;
    *
    *     // Once we have the key and iv, we can create and use the cipher...
    *     const cipher = createCipheriv(algorithm, key, iv);
    *
    *     let encrypted = '';
    *     cipher.setEncoding('hex');
    *
    *     cipher.on('data', (chunk) => encrypted += chunk);
    *     cipher.on('end', () => console.log(encrypted));
    *
    *     cipher.write('some clear text data');
    *     cipher.end();
    *   });
    * });
    * ```
    *
    * Example: Using `Cipher` and piped streams:
    *
    * ```js
    * import {
    *   createReadStream,
    *   createWriteStream,
    * } from 'fs';
    *
    * import {
    *   pipeline
    * } from 'stream';
    *
    * const {
    *   scrypt,
    *   randomFill,
    *   createCipheriv,
    * } = await import('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    *
    * // First, we'll generate the key. The key length is dependent on the algorithm.
    * // In this case for aes192, it is 24 bytes (192 bits).
    * scrypt(password, 'salt', 24, (err, key) => {
    *   if (err) throw err;
    *   // Then, we'll generate a random initialization vector
    *   randomFill(new Uint8Array(16), (err, iv) => {
    *     if (err) throw err;
    *
    *     const cipher = createCipheriv(algorithm, key, iv);
    *
    *     const input = createReadStream('test.js');
    *     const output = createWriteStream('test.enc');
    *
    *     pipeline(input, cipher, output, (err) => {
    *       if (err) throw err;
    *     });
    *   });
    * });
    * ```
    *
    * ```js
    * const {
    *   createReadStream,
    *   createWriteStream,
    * } = require('fs');
    *
    * const {
    *   pipeline
    * } = require('stream');
    *
    * const {
    *   scrypt,
    *   randomFill,
    *   createCipheriv,
    * } = require('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    *
    * // First, we'll generate the key. The key length is dependent on the algorithm.
    * // In this case for aes192, it is 24 bytes (192 bits).
    * scrypt(password, 'salt', 24, (err, key) => {
    *   if (err) throw err;
    *   // Then, we'll generate a random initialization vector
    *   randomFill(new Uint8Array(16), (err, iv) => {
    *     if (err) throw err;
    *
    *     const cipher = createCipheriv(algorithm, key, iv);
    *
    *     const input = createReadStream('test.js');
    *     const output = createWriteStream('test.enc');
    *
    *     pipeline(input, cipher, output, (err) => {
    *       if (err) throw err;
    *     });
    *   });
    * });
    * ```
    *
    * Example: Using the `cipher.update()` and `cipher.final()` methods:
    *
    * ```js
    * const {
    *   scrypt,
    *   randomFill,
    *   createCipheriv,
    * } = await import('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    *
    * // First, we'll generate the key. The key length is dependent on the algorithm.
    * // In this case for aes192, it is 24 bytes (192 bits).
    * scrypt(password, 'salt', 24, (err, key) => {
    *   if (err) throw err;
    *   // Then, we'll generate a random initialization vector
    *   randomFill(new Uint8Array(16), (err, iv) => {
    *     if (err) throw err;
    *
    *     const cipher = createCipheriv(algorithm, key, iv);
    *
    *     let encrypted = cipher.update('some clear text data', 'utf8', 'hex');
    *     encrypted += cipher.final('hex');
    *     console.log(encrypted);
    *   });
    * });
    * ```
    *
    * ```js
    * const {
    *   scrypt,
    *   randomFill,
    *   createCipheriv,
    * } = require('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    *
    * // First, we'll generate the key. The key length is dependent on the algorithm.
    * // In this case for aes192, it is 24 bytes (192 bits).
    * scrypt(password, 'salt', 24, (err, key) => {
    *   if (err) throw err;
    *   // Then, we'll generate a random initialization vector
    *   randomFill(new Uint8Array(16), (err, iv) => {
    *     if (err) throw err;
    *
    *     const cipher = createCipheriv(algorithm, key, iv);
    *
    *     let encrypted = cipher.update('some clear text data', 'utf8', 'hex');
    *     encrypted += cipher.final('hex');
    *     console.log(encrypted);
    *   });
    * });
    * ```
    * @since v0.1.94
    */
  @JSImport("node:crypto", "Cipher")
  @js.native
  class Cipher protected () extends StObject
  
  /** @deprecated since v10.0.0 */
  @JSImport("node:crypto", "DEFAULT_ENCODING")
  @js.native
  val DEFAULT_ENCODING: BufferEncoding = js.native
  
  /**
    * * Extends: `<stream.Transform>`
    *
    * Instances of the `Decipher` class are used to decrypt data. The class can be
    * used in one of two ways:
    *
    * * As a `stream` that is both readable and writable, where plain encrypted
    * data is written to produce unencrypted data on the readable side, or
    * * Using the `decipher.update()` and `decipher.final()` methods to
    * produce the unencrypted data.
    *
    * The {@link createDecipher} or {@link createDecipheriv} methods are
    * used to create `Decipher` instances. `Decipher` objects are not to be created
    * directly using the `new` keyword.
    *
    * Example: Using `Decipher` objects as streams:
    *
    * ```js
    * const {
    *   scryptSync,
    *   createDecipheriv,
    * } = await import('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    * // Key length is dependent on the algorithm. In this case for aes192, it is
    * // 24 bytes (192 bits).
    * // Use the async `crypto.scrypt()` instead.
    * const key = scryptSync(password, 'salt', 24);
    * // The IV is usually passed along with the ciphertext.
    * const iv = Buffer.alloc(16, 0); // Initialization vector.
    *
    * const decipher = createDecipheriv(algorithm, key, iv);
    *
    * let decrypted = '';
    * decipher.on('readable', () => {
    *   while (null !== (chunk = decipher.read())) {
    *     decrypted += chunk.toString('utf8');
    *   }
    * });
    * decipher.on('end', () => {
    *   console.log(decrypted);
    *   // Prints: some clear text data
    * });
    *
    * // Encrypted with same algorithm, key and iv.
    * const encrypted =
    *   'e5f79c5915c02171eec6b212d5520d44480993d7d622a7c4c2da32f6efda0ffa';
    * decipher.write(encrypted, 'hex');
    * decipher.end();
    * ```
    *
    * ```js
    * const {
    *   scryptSync,
    *   createDecipheriv,
    * } = require('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    * // Key length is dependent on the algorithm. In this case for aes192, it is
    * // 24 bytes (192 bits).
    * // Use the async `crypto.scrypt()` instead.
    * const key = scryptSync(password, 'salt', 24);
    * // The IV is usually passed along with the ciphertext.
    * const iv = Buffer.alloc(16, 0); // Initialization vector.
    *
    * const decipher = createDecipheriv(algorithm, key, iv);
    *
    * let decrypted = '';
    * decipher.on('readable', () => {
    *   while (null !== (chunk = decipher.read())) {
    *     decrypted += chunk.toString('utf8');
    *   }
    * });
    * decipher.on('end', () => {
    *   console.log(decrypted);
    *   // Prints: some clear text data
    * });
    *
    * // Encrypted with same algorithm, key and iv.
    * const encrypted =
    *   'e5f79c5915c02171eec6b212d5520d44480993d7d622a7c4c2da32f6efda0ffa';
    * decipher.write(encrypted, 'hex');
    * decipher.end();
    * ```
    *
    * Example: Using `Decipher` and piped streams:
    *
    * ```js
    * import {
    *   createReadStream,
    *   createWriteStream,
    * } from 'fs';
    *
    * const {
    *   scryptSync,
    *   createDecipheriv,
    * } = await import('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    * // Use the async `crypto.scrypt()` instead.
    * const key = scryptSync(password, 'salt', 24);
    * // The IV is usually passed along with the ciphertext.
    * const iv = Buffer.alloc(16, 0); // Initialization vector.
    *
    * const decipher = createDecipheriv(algorithm, key, iv);
    *
    * const input = createReadStream('test.enc');
    * const output = createWriteStream('test.js');
    *
    * input.pipe(decipher).pipe(output);
    * ```
    *
    * ```js
    * const {
    *   createReadStream,
    *   createWriteStream,
    * } = require('fs');
    *
    * const {
    *   scryptSync,
    *   createDecipheriv,
    * } = require('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    * // Use the async `crypto.scrypt()` instead.
    * const key = scryptSync(password, 'salt', 24);
    * // The IV is usually passed along with the ciphertext.
    * const iv = Buffer.alloc(16, 0); // Initialization vector.
    *
    * const decipher = createDecipheriv(algorithm, key, iv);
    *
    * const input = createReadStream('test.enc');
    * const output = createWriteStream('test.js');
    *
    * input.pipe(decipher).pipe(output);
    * ```
    *
    * Example: Using the `decipher.update()` and `decipher.final()` methods:
    *
    * ```js
    * const {
    *   scryptSync,
    *   createDecipheriv,
    * } = await import('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    * // Use the async `crypto.scrypt()` instead.
    * const key = scryptSync(password, 'salt', 24);
    * // The IV is usually passed along with the ciphertext.
    * const iv = Buffer.alloc(16, 0); // Initialization vector.
    *
    * const decipher = createDecipheriv(algorithm, key, iv);
    *
    * // Encrypted using same algorithm, key and iv.
    * const encrypted =
    *   'e5f79c5915c02171eec6b212d5520d44480993d7d622a7c4c2da32f6efda0ffa';
    * let decrypted = decipher.update(encrypted, 'hex', 'utf8');
    * decrypted += decipher.final('utf8');
    * console.log(decrypted);
    * // Prints: some clear text data
    * ```
    *
    * ```js
    * const {
    *   scryptSync,
    *   createDecipheriv,
    * } = require('crypto');
    *
    * const algorithm = 'aes-192-cbc';
    * const password = 'Password used to generate key';
    * // Use the async `crypto.scrypt()` instead.
    * const key = scryptSync(password, 'salt', 24);
    * // The IV is usually passed along with the ciphertext.
    * const iv = Buffer.alloc(16, 0); // Initialization vector.
    *
    * const decipher = createDecipheriv(algorithm, key, iv);
    *
    * // Encrypted using same algorithm, key and iv.
    * const encrypted =
    *   'e5f79c5915c02171eec6b212d5520d44480993d7d622a7c4c2da32f6efda0ffa';
    * let decrypted = decipher.update(encrypted, 'hex', 'utf8');
    * decrypted += decipher.final('utf8');
    * console.log(decrypted);
    * // Prints: some clear text data
    * ```
    * @since v0.1.94
    */
  @JSImport("node:crypto", "Decipher")
  @js.native
  class Decipher protected () extends StObject
  
  /**
    * The `DiffieHellman` class is a utility for creating Diffie-Hellman key
    * exchanges.
    *
    * Instances of the `DiffieHellman` class can be created using the {@link createDiffieHellman} function.
    *
    * ```js
    * import assert from 'assert';
    *
    * const {
    *   createDiffieHellman,
    * } = await import('crypto');
    *
    * // Generate Alice's keys...
    * const alice = createDiffieHellman(2048);
    * const aliceKey = alice.generateKeys();
    *
    * // Generate Bob's keys...
    * const bob = createDiffieHellman(alice.getPrime(), alice.getGenerator());
    * const bobKey = bob.generateKeys();
    *
    * // Exchange and generate the secret...
    * const aliceSecret = alice.computeSecret(bobKey);
    * const bobSecret = bob.computeSecret(aliceKey);
    *
    * // OK
    * assert.strictEqual(aliceSecret.toString('hex'), bobSecret.toString('hex'));
    * ```
    *
    * ```js
    * const assert = require('assert');
    *
    * const {
    *   createDiffieHellman,
    * } = require('crypto');
    *
    * // Generate Alice's keys...
    * const alice = createDiffieHellman(2048);
    * const aliceKey = alice.generateKeys();
    *
    * // Generate Bob's keys...
    * const bob = createDiffieHellman(alice.getPrime(), alice.getGenerator());
    * const bobKey = bob.generateKeys();
    *
    * // Exchange and generate the secret...
    * const aliceSecret = alice.computeSecret(bobKey);
    * const bobSecret = bob.computeSecret(aliceKey);
    *
    * // OK
    * assert.strictEqual(aliceSecret.toString('hex'), bobSecret.toString('hex'));
    * ```
    * @since v0.5.0
    */
  @JSImport("node:crypto", "DiffieHellman")
  @js.native
  class DiffieHellman_ protected ()
    extends tmttyped.node.cryptoMod.DiffieHellman_
  
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
  @JSImport("node:crypto", "ECDH")
  @js.native
  class ECDH protected ()
    extends tmttyped.node.cryptoMod.ECDH
  object ECDH {
    
    @JSImport("node:crypto", "ECDH")
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
    def convertKey(key: BinaryLike, curve: java.lang.String): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: base64,
      format: compressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: base64,
      format: hybrid
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: base64,
      format: uncompressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: hex,
      format: compressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: java.lang.String, inputEncoding: Unit, outputEncoding: hex, format: hybrid): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: hex,
      format: uncompressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: latin1,
      format: compressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: latin1,
      format: hybrid
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: latin1,
      format: uncompressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(key: BinaryLike, curve: java.lang.String, inputEncoding: BinaryToTextEncoding): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: base64,
      format: compressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: base64,
      format: hybrid
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: base64,
      format: uncompressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: hex,
      format: compressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: hex,
      format: hybrid
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: hex,
      format: uncompressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: latin1,
      format: compressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: latin1,
      format: hybrid
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: latin1,
      format: uncompressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    
    @scala.inline
    def convertKey_base64(key: BinaryLike, curve: java.lang.String, inputEncoding: Unit, outputEncoding: base64): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey_base64(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: base64
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    
    @scala.inline
    def convertKey_compressed(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: Unit,
      format: compressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey_compressed(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: Unit,
      format: compressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    
    @scala.inline
    def convertKey_hex(key: BinaryLike, curve: java.lang.String, inputEncoding: Unit, outputEncoding: hex): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey_hex(key: BinaryLike, curve: java.lang.String, inputEncoding: BinaryToTextEncoding, outputEncoding: hex): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    
    @scala.inline
    def convertKey_hybrid(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: Unit,
      format: hybrid
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey_hybrid(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: Unit,
      format: hybrid
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    
    @scala.inline
    def convertKey_latin1(key: BinaryLike, curve: java.lang.String, inputEncoding: Unit, outputEncoding: latin1): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey_latin1(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: latin1
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    
    @scala.inline
    def convertKey_uncompressed(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: Unit,
      outputEncoding: Unit,
      format: uncompressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
    @scala.inline
    def convertKey_uncompressed(
      key: BinaryLike,
      curve: java.lang.String,
      inputEncoding: BinaryToTextEncoding,
      outputEncoding: Unit,
      format: uncompressed
    ): Buffer | java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | java.lang.String]
  }
  
  /**
    * * Extends: `<stream.Transform>`
    *
    * The `Hash` class is a utility for creating hash digests of data. It can be
    * used in one of two ways:
    *
    * * As a `stream` that is both readable and writable, where data is written
    * to produce a computed hash digest on the readable side, or
    * * Using the `hash.update()` and `hash.digest()` methods to produce the
    * computed hash.
    *
    * The {@link createHash} method is used to create `Hash` instances. `Hash`objects are not to be created directly using the `new` keyword.
    *
    * Example: Using `Hash` objects as streams:
    *
    * ```js
    * const {
    *   createHash,
    * } = await import('crypto');
    *
    * const hash = createHash('sha256');
    *
    * hash.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = hash.read();
    *   if (data) {
    *     console.log(data.toString('hex'));
    *     // Prints:
    *     //   6a2da20943931e9834fc12cfe5bb47bbd9ae43489a30726962b576f4e3993e50
    *   }
    * });
    *
    * hash.write('some data to hash');
    * hash.end();
    * ```
    *
    * ```js
    * const {
    *   createHash,
    * } = require('crypto');
    *
    * const hash = createHash('sha256');
    *
    * hash.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = hash.read();
    *   if (data) {
    *     console.log(data.toString('hex'));
    *     // Prints:
    *     //   6a2da20943931e9834fc12cfe5bb47bbd9ae43489a30726962b576f4e3993e50
    *   }
    * });
    *
    * hash.write('some data to hash');
    * hash.end();
    * ```
    *
    * Example: Using `Hash` and piped streams:
    *
    * ```js
    * import { createReadStream } from 'fs';
    *
    * const {
    *   createHash,
    * } = await import('crypto');
    * const hash = createHash('sha256');
    *
    * const input = createReadStream('test.js');
    * input.pipe(hash).setEncoding('hex').pipe(process.stdout);
    * ```
    *
    * ```js
    * const {
    *   createReadStream,
    * } = require('fs');
    *
    * const {
    *   createHash,
    * } = require('crypto');
    *
    * const hash = createHash('sha256');
    *
    * const input = createReadStream('test.js');
    * input.pipe(hash).setEncoding('hex').pipe(process.stdout);
    * ```
    *
    * Example: Using the `hash.update()` and `hash.digest()` methods:
    *
    * ```js
    * const {
    *   createHash,
    * } = await import('crypto');
    *
    * const hash = createHash('sha256');
    *
    * hash.update('some data to hash');
    * console.log(hash.digest('hex'));
    * // Prints:
    * //   6a2da20943931e9834fc12cfe5bb47bbd9ae43489a30726962b576f4e3993e50
    * ```
    *
    * ```js
    * const {
    *   createHash,
    * } = require('crypto');
    *
    * const hash = createHash('sha256');
    *
    * hash.update('some data to hash');
    * console.log(hash.digest('hex'));
    * // Prints:
    * //   6a2da20943931e9834fc12cfe5bb47bbd9ae43489a30726962b576f4e3993e50
    * ```
    * @since v0.1.92
    */
  @JSImport("node:crypto", "Hash")
  @js.native
  class Hash protected () extends StObject
  
  /**
    * * Extends: `<stream.Transform>`
    *
    * The `Hmac` class is a utility for creating cryptographic HMAC digests. It can
    * be used in one of two ways:
    *
    * * As a `stream` that is both readable and writable, where data is written
    * to produce a computed HMAC digest on the readable side, or
    * * Using the `hmac.update()` and `hmac.digest()` methods to produce the
    * computed HMAC digest.
    *
    * The {@link createHmac} method is used to create `Hmac` instances. `Hmac`objects are not to be created directly using the `new` keyword.
    *
    * Example: Using `Hmac` objects as streams:
    *
    * ```js
    * const {
    *   createHmac,
    * } = await import('crypto');
    *
    * const hmac = createHmac('sha256', 'a secret');
    *
    * hmac.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = hmac.read();
    *   if (data) {
    *     console.log(data.toString('hex'));
    *     // Prints:
    *     //   7fd04df92f636fd450bc841c9418e5825c17f33ad9c87c518115a45971f7f77e
    *   }
    * });
    *
    * hmac.write('some data to hash');
    * hmac.end();
    * ```
    *
    * ```js
    * const {
    *   createHmac,
    * } = require('crypto');
    *
    * const hmac = createHmac('sha256', 'a secret');
    *
    * hmac.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = hmac.read();
    *   if (data) {
    *     console.log(data.toString('hex'));
    *     // Prints:
    *     //   7fd04df92f636fd450bc841c9418e5825c17f33ad9c87c518115a45971f7f77e
    *   }
    * });
    *
    * hmac.write('some data to hash');
    * hmac.end();
    * ```
    *
    * Example: Using `Hmac` and piped streams:
    *
    * ```js
    * import { createReadStream } from 'fs';
    *
    * const {
    *   createHmac,
    * } = await import('crypto');
    *
    * const hmac = createHmac('sha256', 'a secret');
    *
    * const input = createReadStream('test.js');
    * input.pipe(hmac).pipe(process.stdout);
    * ```
    *
    * ```js
    * const {
    *   createReadStream,
    * } = require('fs');
    *
    * const {
    *   createHmac,
    * } = require('crypto');
    *
    * const hmac = createHmac('sha256', 'a secret');
    *
    * const input = createReadStream('test.js');
    * input.pipe(hmac).pipe(process.stdout);
    * ```
    *
    * Example: Using the `hmac.update()` and `hmac.digest()` methods:
    *
    * ```js
    * const {
    *   createHmac,
    * } = await import('crypto');
    *
    * const hmac = createHmac('sha256', 'a secret');
    *
    * hmac.update('some data to hash');
    * console.log(hmac.digest('hex'));
    * // Prints:
    * //   7fd04df92f636fd450bc841c9418e5825c17f33ad9c87c518115a45971f7f77e
    * ```
    *
    * ```js
    * const {
    *   createHmac,
    * } = require('crypto');
    *
    * const hmac = createHmac('sha256', 'a secret');
    *
    * hmac.update('some data to hash');
    * console.log(hmac.digest('hex'));
    * // Prints:
    * //   7fd04df92f636fd450bc841c9418e5825c17f33ad9c87c518115a45971f7f77e
    * ```
    * @since v0.1.94
    */
  @JSImport("node:crypto", "Hmac")
  @js.native
  class Hmac protected () extends StObject
  
  /**
    * Node.js uses a `KeyObject` class to represent a symmetric or asymmetric key,
    * and each kind of key exposes different functions. The {@link createSecretKey}, {@link createPublicKey} and {@link createPrivateKey} methods are used to create `KeyObject`instances. `KeyObject`
    * objects are not to be created directly using the `new`keyword.
    *
    * Most applications should consider using the new `KeyObject` API instead of
    * passing keys as strings or `Buffer`s due to improved security features.
    *
    * `KeyObject` instances can be passed to other threads via `postMessage()`.
    * The receiver obtains a cloned `KeyObject`, and the `KeyObject` does not need to
    * be listed in the `transferList` argument.
    * @since v11.6.0
    */
  @JSImport("node:crypto", "KeyObject")
  @js.native
  class KeyObject protected ()
    extends tmttyped.node.cryptoMod.KeyObject
  
  /**
    * * Extends: `<stream.Writable>`
    *
    * The `Sign` class is a utility for generating signatures. It can be used in one
    * of two ways:
    *
    * * As a writable `stream`, where data to be signed is written and the `sign.sign()` method is used to generate and return the signature, or
    * * Using the `sign.update()` and `sign.sign()` methods to produce the
    * signature.
    *
    * The {@link createSign} method is used to create `Sign` instances. The
    * argument is the string name of the hash function to use. `Sign` objects are not
    * to be created directly using the `new` keyword.
    *
    * Example: Using `Sign` and `Verify` objects as streams:
    *
    * ```js
    * const {
    *   generateKeyPairSync,
    *   createSign,
    *   createVerify,
    * } = await import('crypto');
    *
    * const { privateKey, publicKey } = generateKeyPairSync('ec', {
    *   namedCurve: 'sect239k1'
    * });
    *
    * const sign = createSign('SHA256');
    * sign.write('some data to sign');
    * sign.end();
    * const signature = sign.sign(privateKey, 'hex');
    *
    * const verify = createVerify('SHA256');
    * verify.write('some data to sign');
    * verify.end();
    * console.log(verify.verify(publicKey, signature, 'hex'));
    * // Prints: true
    * ```
    *
    * ```js
    * const {
    *   generateKeyPairSync,
    *   createSign,
    *   createVerify,
    * } = require('crypto');
    *
    * const { privateKey, publicKey } = generateKeyPairSync('ec', {
    *   namedCurve: 'sect239k1'
    * });
    *
    * const sign = createSign('SHA256');
    * sign.write('some data to sign');
    * sign.end();
    * const signature = sign.sign(privateKey, 'hex');
    *
    * const verify = createVerify('SHA256');
    * verify.write('some data to sign');
    * verify.end();
    * console.log(verify.verify(publicKey, signature, 'hex'));
    * // Prints: true
    * ```
    *
    * Example: Using the `sign.update()` and `verify.update()` methods:
    *
    * ```js
    * const {
    *   generateKeyPairSync,
    *   createSign,
    *   createVerify,
    * } = await import('crypto');
    *
    * const { privateKey, publicKey } = generateKeyPairSync('rsa', {
    *   modulusLength: 2048,
    * });
    *
    * const sign = createSign('SHA256');
    * sign.update('some data to sign');
    * sign.end();
    * const signature = sign.sign(privateKey);
    *
    * const verify = createVerify('SHA256');
    * verify.update('some data to sign');
    * verify.end();
    * console.log(verify.verify(publicKey, signature));
    * // Prints: true
    * ```
    *
    * ```js
    * const {
    *   generateKeyPairSync,
    *   createSign,
    *   createVerify,
    * } = require('crypto');
    *
    * const { privateKey, publicKey } = generateKeyPairSync('rsa', {
    *   modulusLength: 2048,
    * });
    *
    * const sign = createSign('SHA256');
    * sign.update('some data to sign');
    * sign.end();
    * const signature = sign.sign(privateKey);
    *
    * const verify = createVerify('SHA256');
    * verify.update('some data to sign');
    * verify.end();
    * console.log(verify.verify(publicKey, signature));
    * // Prints: true
    * ```
    * @since v0.1.92
    */
  @JSImport("node:crypto", "Sign")
  @js.native
  class Sign_ protected () extends StObject
  
  /**
    * * Extends: `<stream.Writable>`
    *
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
  @JSImport("node:crypto", "Verify")
  @js.native
  class Verify_ protected () extends StObject
  
  /**
    * Encapsulates an X509 certificate and provides read-only access to
    * its information.
    *
    * ```js
    * const { X509Certificate } = await import('crypto');
    *
    * const x509 = new X509Certificate('{... pem encoded cert ...}');
    *
    * console.log(x509.subject);
    * ```
    *
    * ```js
    * const { X509Certificate } = require('crypto');
    *
    * const x509 = new X509Certificate('{... pem encoded cert ...}');
    *
    * console.log(x509.subject);
    * ```
    * @since v15.6.0
    */
  @JSImport("node:crypto", "X509Certificate")
  @js.native
  class X509Certificate protected ()
    extends tmttyped.node.cryptoMod.X509Certificate
       with _TransferListItem {
    def this(buffer: BinaryLike) = this()
  }
  
  /**
    * Checks the primality of the `candidate`.
    * @since v15.8.0
    * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
    */
  @scala.inline
  def checkPrime(
    value: LargeNumberLike,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPrime")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def checkPrime(
    value: LargeNumberLike,
    options: CheckPrimeOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPrime")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Checks the primality of the `candidate`.
    * @since v15.8.0
    * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
    * @return `true` if the candidate is a prime with an error probability less than `0.25 ** options.checks`.
    */
  @scala.inline
  def checkPrimeSync(value: LargeNumberLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPrimeSync")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def checkPrimeSync(value: LargeNumberLike, options: CheckPrimeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPrimeSync")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object constants {
    
    @JSImport("node:crypto", "constants.ALPN_ENABLED")
    @js.native
    val ALPN_ENABLED: Double = js.native
    
    @JSImport("node:crypto", "constants.DH_CHECK_P_NOT_PRIME")
    @js.native
    val DH_CHECK_P_NOT_PRIME: Double = js.native
    
    @JSImport("node:crypto", "constants.DH_CHECK_P_NOT_SAFE_PRIME")
    @js.native
    val DH_CHECK_P_NOT_SAFE_PRIME: Double = js.native
    
    @JSImport("node:crypto", "constants.DH_NOT_SUITABLE_GENERATOR")
    @js.native
    val DH_NOT_SUITABLE_GENERATOR: Double = js.native
    
    @JSImport("node:crypto", "constants.DH_UNABLE_TO_CHECK_GENERATOR")
    @js.native
    val DH_UNABLE_TO_CHECK_GENERATOR: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_ALL")
    @js.native
    val ENGINE_METHOD_ALL: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_CIPHERS")
    @js.native
    val ENGINE_METHOD_CIPHERS: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_DH")
    @js.native
    val ENGINE_METHOD_DH: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_DIGESTS")
    @js.native
    val ENGINE_METHOD_DIGESTS: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_DSA")
    @js.native
    val ENGINE_METHOD_DSA: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_EC")
    @js.native
    val ENGINE_METHOD_EC: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_NONE")
    @js.native
    val ENGINE_METHOD_NONE: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_PKEY_ASN1_METHS")
    @js.native
    val ENGINE_METHOD_PKEY_ASN1_METHS: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_PKEY_METHS")
    @js.native
    val ENGINE_METHOD_PKEY_METHS: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_RAND")
    @js.native
    val ENGINE_METHOD_RAND: Double = js.native
    
    @JSImport("node:crypto", "constants.ENGINE_METHOD_RSA")
    @js.native
    val ENGINE_METHOD_RSA: Double = js.native
    
    // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
    @JSImport("node:crypto", "constants.OPENSSL_VERSION_NUMBER")
    @js.native
    val OPENSSL_VERSION_NUMBER: Double = js.native
    
    @JSImport("node:crypto", "constants.POINT_CONVERSION_COMPRESSED")
    @js.native
    val POINT_CONVERSION_COMPRESSED: Double = js.native
    
    @JSImport("node:crypto", "constants.POINT_CONVERSION_HYBRID")
    @js.native
    val POINT_CONVERSION_HYBRID: Double = js.native
    
    @JSImport("node:crypto", "constants.POINT_CONVERSION_UNCOMPRESSED")
    @js.native
    val POINT_CONVERSION_UNCOMPRESSED: Double = js.native
    
    @JSImport("node:crypto", "constants.RSA_NO_PADDING")
    @js.native
    val RSA_NO_PADDING: Double = js.native
    
    @JSImport("node:crypto", "constants.RSA_PKCS1_OAEP_PADDING")
    @js.native
    val RSA_PKCS1_OAEP_PADDING: Double = js.native
    
    @JSImport("node:crypto", "constants.RSA_PKCS1_PADDING")
    @js.native
    val RSA_PKCS1_PADDING: Double = js.native
    
    @JSImport("node:crypto", "constants.RSA_PKCS1_PSS_PADDING")
    @js.native
    val RSA_PKCS1_PSS_PADDING: Double = js.native
    
    /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
    @JSImport("node:crypto", "constants.RSA_PSS_SALTLEN_AUTO")
    @js.native
    val RSA_PSS_SALTLEN_AUTO: Double = js.native
    
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
    @JSImport("node:crypto", "constants.RSA_PSS_SALTLEN_DIGEST")
    @js.native
    val RSA_PSS_SALTLEN_DIGEST: Double = js.native
    
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
    @JSImport("node:crypto", "constants.RSA_PSS_SALTLEN_MAX_SIGN")
    @js.native
    val RSA_PSS_SALTLEN_MAX_SIGN: Double = js.native
    
    @JSImport("node:crypto", "constants.RSA_SSLV23_PADDING")
    @js.native
    val RSA_SSLV23_PADDING: Double = js.native
    
    @JSImport("node:crypto", "constants.RSA_X931_PADDING")
    @js.native
    val RSA_X931_PADDING: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NO_SSLv2")
    @js.native
    val SSLOPNOSSLv2: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NO_SSLv3")
    @js.native
    val SSLOPNOSSLv3: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NO_TLSv1")
    @js.native
    val SSLOPNOTLSv1: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NO_TLSv1_1")
    @js.native
    val SSLOPNOTLSv11: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NO_TLSv1_2")
    @js.native
    val SSLOPNOTLSv12: Double = js.native
    
    /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
    @JSImport("node:crypto", "constants.SSL_OP_ALL")
    @js.native
    val SSL_OP_ALL: Double = js.native
    
    /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    @JSImport("node:crypto", "constants.SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION")
    @js.native
    val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double = js.native
    
    /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    @JSImport("node:crypto", "constants.SSL_OP_CIPHER_SERVER_PREFERENCE")
    @js.native
    val SSL_OP_CIPHER_SERVER_PREFERENCE: Double = js.native
    
    /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
    @JSImport("node:crypto", "constants.SSL_OP_CISCO_ANYCONNECT")
    @js.native
    val SSL_OP_CISCO_ANYCONNECT: Double = js.native
    
    /** Instructs OpenSSL to turn on cookie exchange. */
    @JSImport("node:crypto", "constants.SSL_OP_COOKIE_EXCHANGE")
    @js.native
    val SSL_OP_COOKIE_EXCHANGE: Double = js.native
    
    /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
    @JSImport("node:crypto", "constants.SSL_OP_CRYPTOPRO_TLSEXT_BUG")
    @js.native
    val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
    @JSImport("node:crypto", "constants.SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS")
    @js.native
    val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double = js.native
    
    /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
    @JSImport("node:crypto", "constants.SSL_OP_EPHEMERAL_RSA")
    @js.native
    val SSL_OP_EPHEMERAL_RSA: Double = js.native
    
    /** Allows initial connection to servers that do not support RI. */
    @JSImport("node:crypto", "constants.SSL_OP_LEGACY_SERVER_CONNECT")
    @js.native
    val SSL_OP_LEGACY_SERVER_CONNECT: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER")
    @js.native
    val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_MICROSOFT_SESS_ID_BUG")
    @js.native
    val SSL_OP_MICROSOFT_SESS_ID_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
    @JSImport("node:crypto", "constants.SSL_OP_MSIE_SSLV2_RSA_PADDING")
    @js.native
    val SSL_OP_MSIE_SSLV2_RSA_PADDING: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NETSCAPE_CA_DN_BUG")
    @js.native
    val SSL_OP_NETSCAPE_CA_DN_BUG: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NETSCAPE_CHALLENGE_BUG")
    @js.native
    val SSL_OP_NETSCAPE_CHALLENGE_BUG: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG")
    @js.native
    val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG")
    @js.native
    val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable support for SSL/TLS compression. */
    @JSImport("node:crypto", "constants.SSL_OP_NO_COMPRESSION")
    @js.native
    val SSL_OP_NO_COMPRESSION: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NO_QUERY_MTU")
    @js.native
    val SSL_OP_NO_QUERY_MTU: Double = js.native
    
    /** Instructs OpenSSL to always start a new session when performing renegotiation. */
    @JSImport("node:crypto", "constants.SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION")
    @js.native
    val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_NO_TICKET")
    @js.native
    val SSL_OP_NO_TICKET: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_PKCS1_CHECK_1")
    @js.native
    val SSL_OP_PKCS1_CHECK_1: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_PKCS1_CHECK_2")
    @js.native
    val SSL_OP_PKCS1_CHECK_2: Double = js.native
    
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
    @JSImport("node:crypto", "constants.SSL_OP_SINGLE_DH_USE")
    @js.native
    val SSL_OP_SINGLE_DH_USE: Double = js.native
    
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
    @JSImport("node:crypto", "constants.SSL_OP_SINGLE_ECDH_USE")
    @js.native
    val SSL_OP_SINGLE_ECDH_USE: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_SSLEAY_080_CLIENT_DH_BUG")
    @js.native
    val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG")
    @js.native
    val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_TLS_BLOCK_PADDING_BUG")
    @js.native
    val SSL_OP_TLS_BLOCK_PADDING_BUG: Double = js.native
    
    @JSImport("node:crypto", "constants.SSL_OP_TLS_D5_BUG")
    @js.native
    val SSL_OP_TLS_D5_BUG: Double = js.native
    
    /** Instructs OpenSSL to disable version rollback attack detection. */
    @JSImport("node:crypto", "constants.SSL_OP_TLS_ROLLBACK_BUG")
    @js.native
    val SSL_OP_TLS_ROLLBACK_BUG: Double = js.native
    
    /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
    @JSImport("node:crypto", "constants.defaultCipherList")
    @js.native
    val defaultCipherList: java.lang.String = js.native
    
    /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
    @JSImport("node:crypto", "constants.defaultCoreCipherList")
    @js.native
    val defaultCoreCipherList: java.lang.String = js.native
  }
  
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: java.lang.String, password: BinaryLike): tmttyped.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipher(algorithm: java.lang.String, password: BinaryLike, options: TransformOptions): tmttyped.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  /**
    * Creates and returns a `Cipher` object that uses the given `algorithm` and`password`.
    *
    * The `options` argument controls stream behavior and is optional except when a
    * cipher in CCM or OCB mode is used (e.g. `'aes-128-ccm'`). In that case, the`authTagLength` option is required and specifies the length of the
    * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to set the length of the authentication
    * tag that will be returned by `getAuthTag()` and defaults to 16 bytes.
    *
    * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
    * recent OpenSSL releases, `openssl list -cipher-algorithms`(`openssl list-cipher-algorithms` for older versions of OpenSSL) will
    * display the available cipher algorithms.
    *
    * The `password` is used to derive the cipher key and initialization vector (IV).
    * The value must be either a `'latin1'` encoded string, a `Buffer`, a`TypedArray`, or a `DataView`.
    *
    * The implementation of `crypto.createCipher()` derives keys using the OpenSSL
    * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
    * iteration, and no salt. The lack of salt allows dictionary attacks as the same
    * password always creates the same key. The low iteration count and
    * non-cryptographically secure hash algorithm allow passwords to be tested very
    * rapidly.
    *
    * In line with OpenSSL's recommendation to use a more modern algorithm instead of[`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
    * developers derive a key and IV on
    * their own using {@link scrypt} and to use {@link createCipheriv} to create the `Cipher` object. Users should not use ciphers with counter mode
    * (e.g. CTR, GCM, or CCM) in `crypto.createCipher()`. A warning is emitted when
    * they are used in order to avoid the risk of IV reuse that causes
    * vulnerabilities. For the case when IV is reused in GCM, see [Nonce-Disrespecting Adversaries](https://github.com/nonce-disrespect/nonce-disrespect) for details.
    * @since v0.1.94
    * @deprecated Since v10.0.0 - Use {@link createCipheriv} instead.
    * @param options `stream.transform` options
    */
  @scala.inline
  def createCipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  @scala.inline
  def createCipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  
  @scala.inline
  def createCipheriv(algorithm: java.lang.String, key: CipherKey): tmttyped.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(algorithm: java.lang.String, key: CipherKey, iv: Null, options: TransformOptions): tmttyped.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(algorithm: java.lang.String, key: CipherKey, iv: BinaryLike): tmttyped.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(algorithm: java.lang.String, key: CipherKey, iv: BinaryLike, options: TransformOptions): tmttyped.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
  /**
    * Creates and returns a `Cipher` object, with the given `algorithm`, `key` and
    * initialization vector (`iv`).
    *
    * The `options` argument controls stream behavior and is optional except when a
    * cipher in CCM or OCB mode is used (e.g. `'aes-128-ccm'`). In that case, the`authTagLength` option is required and specifies the length of the
    * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to set the length of the authentication
    * tag that will be returned by `getAuthTag()` and defaults to 16 bytes.
    *
    * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
    * recent OpenSSL releases, `openssl list -cipher-algorithms`(`openssl list-cipher-algorithms` for older versions of OpenSSL) will
    * display the available cipher algorithms.
    *
    * The `key` is the raw key used by the `algorithm` and `iv` is an[initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
    * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
    * a `KeyObject` of type `secret`. If the cipher does not need
    * an initialization vector, `iv` may be `null`.
    *
    * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
    *
    * Initialization vectors should be unpredictable and unique; ideally, they will be
    * cryptographically random. They do not have to be secret: IVs are typically just
    * added to ciphertext messages unencrypted. It may sound contradictory that
    * something has to be unpredictable and unique, but does not have to be secret;
    * remember that an attacker must not be able to predict ahead of time what a
    * given IV will be.
    * @since v0.1.94
    * @param options `stream.transform` options
    */
  @scala.inline
  def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
  @scala.inline
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  @scala.inline
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  @scala.inline
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  @scala.inline
  def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
  
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: java.lang.String, password: BinaryLike): tmttyped.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipher(algorithm: java.lang.String, password: BinaryLike, options: TransformOptions): tmttyped.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  /**
    * Creates and returns a `Decipher` object that uses the given `algorithm` and`password` (key).
    *
    * The `options` argument controls stream behavior and is optional except when a
    * cipher in CCM or OCB mode is used (e.g. `'aes-128-ccm'`). In that case, the`authTagLength` option is required and specifies the length of the
    * authentication tag in bytes, see `CCM mode`.
    *
    * The implementation of `crypto.createDecipher()` derives keys using the OpenSSL
    * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
    * iteration, and no salt. The lack of salt allows dictionary attacks as the same
    * password always creates the same key. The low iteration count and
    * non-cryptographically secure hash algorithm allow passwords to be tested very
    * rapidly.
    *
    * In line with OpenSSL's recommendation to use a more modern algorithm instead of[`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
    * developers derive a key and IV on
    * their own using {@link scrypt} and to use {@link createDecipheriv} to create the `Decipher` object.
    * @since v0.1.94
    * @deprecated Since v10.0.0 - Use {@link createDecipheriv} instead.
    * @param options `stream.transform` options
    */
  @scala.inline
  def createDecipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  @scala.inline
  def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  
  @scala.inline
  def createDecipheriv(algorithm: java.lang.String, key: CipherKey): tmttyped.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(algorithm: java.lang.String, key: CipherKey, iv: Null, options: TransformOptions): tmttyped.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(algorithm: java.lang.String, key: CipherKey, iv: BinaryLike): tmttyped.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(algorithm: java.lang.String, key: CipherKey, iv: BinaryLike, options: TransformOptions): tmttyped.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: Null, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
  /**
    * Creates and returns a `Decipher` object that uses the given `algorithm`, `key`and initialization vector (`iv`).
    *
    * The `options` argument controls stream behavior and is optional except when a
    * cipher in CCM or OCB mode is used (e.g. `'aes-128-ccm'`). In that case, the`authTagLength` option is required and specifies the length of the
    * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to restrict accepted authentication tags
    * to those with the specified length.
    *
    * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
    * recent OpenSSL releases, `openssl list -cipher-algorithms`(`openssl list-cipher-algorithms` for older versions of OpenSSL) will
    * display the available cipher algorithms.
    *
    * The `key` is the raw key used by the `algorithm` and `iv` is an[initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
    * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
    * a `KeyObject` of type `secret`. If the cipher does not need
    * an initialization vector, `iv` may be `null`.
    *
    * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
    *
    * Initialization vectors should be unpredictable and unique; ideally, they will be
    * cryptographically random. They do not have to be secret: IVs are typically just
    * added to ciphertext messages unencrypted. It may sound contradictory that
    * something has to be unpredictable and unique, but does not have to be secret;
    * remember that an attacker must not be able to predict ahead of time what a given
    * IV will be.
    * @since v0.1.94
    * @param options `stream.transform` options
    */
  @scala.inline
  def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
  @scala.inline
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  @scala.inline
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: Null, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  @scala.inline
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  @scala.inline
  def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
  
  /**
    * Creates a `DiffieHellman` key exchange object using the supplied `prime` and an
    * optional specific `generator`.
    *
    * The `generator` argument can be a number, string, or `Buffer`. If`generator` is not specified, the value `2` is used.
    *
    * If `primeEncoding` is specified, `prime` is expected to be a string; otherwise
    * a `Buffer`, `TypedArray`, or `DataView` is expected.
    *
    * If `generatorEncoding` is specified, `generator` is expected to be a string;
    * otherwise a number, `Buffer`, `TypedArray`, or `DataView` is expected.
    * @since v0.11.12
    * @param primeEncoding The `encoding` of the `prime` string.
    * @param generatorEncoding The `encoding` of the `generator` string.
    */
  @scala.inline
  def createDiffieHellman(prime_length: Double): tmttyped.node.cryptoMod.DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: Double, generator: Double): tmttyped.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: Double, generator: ArrayBufferView): tmttyped.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: java.lang.String, prime_encoding: BinaryToTextEncoding): tmttyped.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: BinaryToTextEncoding,
    generator: java.lang.String,
    generator_encoding: BinaryToTextEncoding
  ): tmttyped.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generator_encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: java.lang.String, prime_encoding: BinaryToTextEncoding, generator: Double): tmttyped.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: java.lang.String, prime_encoding: BinaryToTextEncoding, generator: ArrayBufferView): tmttyped.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: ArrayBufferView): tmttyped.node.cryptoMod.DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  
  /**
    * Creates an Elliptic Curve Diffie-Hellman (`ECDH`) key exchange object using a
    * predefined curve specified by the `curveName` string. Use {@link getCurves} to obtain a list of available curve names. On recent
    * OpenSSL releases, `openssl ecparam -list_curves` will also display the name
    * and description of each available elliptic curve.
    * @since v0.11.14
    */
  @scala.inline
  def createECDH(curve_name: java.lang.String): tmttyped.node.cryptoMod.ECDH = ^.asInstanceOf[js.Dynamic].applyDynamic("createECDH")(curve_name.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.ECDH]
  
  /**
    * Creates and returns a `Hash` object that can be used to generate hash digests
    * using the given `algorithm`. Optional `options` argument controls stream
    * behavior. For XOF hash functions such as `'shake256'`, the `outputLength` option
    * can be used to specify the desired output length in bytes.
    *
    * The `algorithm` is dependent on the available algorithms supported by the
    * version of OpenSSL on the platform. Examples are `'sha256'`, `'sha512'`, etc.
    * On recent releases of OpenSSL, `openssl list -digest-algorithms`(`openssl list-message-digest-algorithms` for older versions of OpenSSL) will
    * display the available digest algorithms.
    *
    * Example: generating the sha256 sum of a file
    *
    * ```js
    * import {
    *   createReadStream
    * } from 'fs';
    *
    * const {
    *   createHash,
    * } = await import('crypto');
    *
    * const filename = process.argv[2];
    *
    * const hash = createHash('sha256');
    *
    * const input = createReadStream(filename);
    * input.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = input.read();
    *   if (data)
    *     hash.update(data);
    *   else {
    *     console.log(`${hash.digest('hex')} ${filename}`);
    *   }
    * });
    * ```
    *
    * ```js
    * const {
    *   createReadStream,
    * } = require('fs');
    *
    * const {
    *   createHash,
    * } = require('crypto');
    *
    * const filename = process.argv[2];
    *
    * const hash = createHash('sha256');
    *
    * const input = createReadStream(filename);
    * input.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = input.read();
    *   if (data)
    *     hash.update(data);
    *   else {
    *     console.log(`${hash.digest('hex')} ${filename}`);
    *   }
    * });
    * ```
    * @since v0.1.92
    * @param options `stream.transform` options
    */
  @scala.inline
  def createHash(algorithm: java.lang.String): tmttyped.node.cryptoMod.Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.Hash]
  @scala.inline
  def createHash(algorithm: java.lang.String, options: HashOptions): tmttyped.node.cryptoMod.Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hash]
  
  /**
    * Creates and returns an `Hmac` object that uses the given `algorithm` and `key`.
    * Optional `options` argument controls stream behavior.
    *
    * The `algorithm` is dependent on the available algorithms supported by the
    * version of OpenSSL on the platform. Examples are `'sha256'`, `'sha512'`, etc.
    * On recent releases of OpenSSL, `openssl list -digest-algorithms`(`openssl list-message-digest-algorithms` for older versions of OpenSSL) will
    * display the available digest algorithms.
    *
    * The `key` is the HMAC key used to generate the cryptographic HMAC hash. If it is
    * a `KeyObject`, its type must be `secret`.
    *
    * Example: generating the sha256 HMAC of a file
    *
    * ```js
    * import {
    *   createReadStream
    * } from 'fs';
    *
    * const {
    *   createHmac,
    * } = await import('crypto');
    *
    * const filename = process.argv[2];
    *
    * const hmac = createHmac('sha256', 'a secret');
    *
    * const input = createReadStream(filename);
    * input.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = input.read();
    *   if (data)
    *     hmac.update(data);
    *   else {
    *     console.log(`${hmac.digest('hex')} ${filename}`);
    *   }
    * });
    * ```
    *
    * ```js
    * const {
    *   createReadStream,
    * } = require('fs');
    *
    * const {
    *   createHmac,
    * } = require('crypto');
    *
    * const filename = process.argv[2];
    *
    * const hmac = createHmac('sha256', 'a secret');
    *
    * const input = createReadStream(filename);
    * input.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = input.read();
    *   if (data)
    *     hmac.update(data);
    *   else {
    *     console.log(`${hmac.digest('hex')} ${filename}`);
    *   }
    * });
    * ```
    * @since v0.1.94
    * @param options `stream.transform` options
    */
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: BinaryLike): tmttyped.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: BinaryLike, options: TransformOptions): tmttyped.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: tmttyped.node.cryptoMod.KeyObject): tmttyped.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: tmttyped.node.cryptoMod.KeyObject, options: TransformOptions): tmttyped.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Hmac]
  
  @scala.inline
  def createPrivateKey(key: java.lang.String): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: Buffer): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: JsonWebKeyInput): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  /**
    * Creates and returns a new key object containing a private key. If `key` is a
    * string or `Buffer`, `format` is assumed to be `'pem'`; otherwise, `key`must be an object with the properties described above.
    *
    * If the private key is encrypted, a `passphrase` must be specified. The length
    * of the passphrase is limited to 1024 bytes.
    * @since v11.6.0
    */
  @scala.inline
  def createPrivateKey(key: PrivateKeyInput): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createPublicKey(key: java.lang.String): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: Buffer): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: JsonWebKeyInput): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: tmttyped.node.cryptoMod.KeyObject): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  /**
    * Creates and returns a new key object containing a public key. If `key` is a
    * string or `Buffer`, `format` is assumed to be `'pem'`; if `key` is a `KeyObject`with type `'private'`, the public key is derived from the given private key;
    * otherwise, `key` must be an object with the properties described above.
    *
    * If the format is `'pem'`, the `'key'` may also be an X.509 certificate.
    *
    * Because public keys can be derived from private keys, a private key may be
    * passed instead of a public key. In that case, this function behaves as if {@link createPrivateKey} had been called, except that the type of the
    * returned `KeyObject` will be `'public'` and that the private key cannot be
    * extracted from the returned `KeyObject`. Similarly, if a `KeyObject` with type`'private'` is given, a new `KeyObject` with type `'public'` will be returned
    * and it will be impossible to extract the private key from the returned object.
    * @since v11.6.0
    */
  @scala.inline
  def createPublicKey(key: PublicKeyInput): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  
  /**
    * Creates and returns a new key object containing a secret key for symmetric
    * encryption or `Hmac`.
    * @since v11.6.0
    * @param encoding The string encoding when `key` is a string.
    */
  @scala.inline
  def createSecretKey(key: ArrayBufferView): tmttyped.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecretKey")(key.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.KeyObject]
  
  /**
    * Creates and returns a `Sign` object that uses the given `algorithm`. Use {@link getHashes} to obtain the names of the available digest algorithms.
    * Optional `options` argument controls the `stream.Writable` behavior.
    *
    * In some cases, a `Sign` instance can be created using the name of a signature
    * algorithm, such as `'RSA-SHA256'`, instead of a digest algorithm. This will use
    * the corresponding digest algorithm. This does not work for all signature
    * algorithms, such as `'ecdsa-with-SHA256'`, so it is best to always use digest
    * algorithm names.
    * @since v0.1.92
    * @param options `stream.Writable` options
    */
  @scala.inline
  def createSign(algorithm: java.lang.String): tmttyped.node.cryptoMod.Sign_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.Sign_]
  @scala.inline
  def createSign(algorithm: java.lang.String, options: WritableOptions): tmttyped.node.cryptoMod.Sign_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Sign_]
  
  /**
    * Creates and returns a `Verify` object that uses the given algorithm.
    * Use {@link getHashes} to obtain an array of names of the available
    * signing algorithms. Optional `options` argument controls the`stream.Writable` behavior.
    *
    * In some cases, a `Verify` instance can be created using the name of a signature
    * algorithm, such as `'RSA-SHA256'`, instead of a digest algorithm. This will use
    * the corresponding digest algorithm. This does not work for all signature
    * algorithms, such as `'ecdsa-with-SHA256'`, so it is best to always use digest
    * algorithm names.
    * @since v0.1.92
    * @param options `stream.Writable` options
    */
  @scala.inline
  def createVerify(algorithm: java.lang.String): tmttyped.node.cryptoMod.Verify_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.Verify_]
  @scala.inline
  def createVerify(algorithm: java.lang.String, options: WritableOptions): tmttyped.node.cryptoMod.Verify_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.cryptoMod.Verify_]
  
  /**
    * Computes the Diffie-Hellman secret based on a `privateKey` and a `publicKey`.
    * Both keys must have the same `asymmetricKeyType`, which must be one of `'dh'`(for Diffie-Hellman), `'ec'` (for ECDH), `'x448'`, or `'x25519'` (for ECDH-ES).
    * @since v13.9.0, v12.17.0
    */
  @scala.inline
  def diffieHellman(options: PrivateKey): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("diffieHellman")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /** @deprecated since v10.0.0 */
  @JSImport("node:crypto", "fips")
  @js.native
  val fips: Boolean = js.native
  
  @scala.inline
  def generateKeyPair(
    `type`: dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: dsa,
    options: DSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ec,
    options: ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ec,
    options: ECKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed25519,
    options: Unit,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed25519,
    options: ED25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed25519,
    options: ED25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed448,
    options: Unit,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed448,
    options: ED448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: ed448,
    options: ED448KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Generates a new asymmetric key pair of the given `type`. RSA, DSA, EC, Ed25519,
    * Ed448, X25519, X448, and DH are currently supported.
    *
    * If a `publicKeyEncoding` or `privateKeyEncoding` was specified, this function
    * behaves as if `keyObject.export()` had been called on its result. Otherwise,
    * the respective part of the key is returned as a `KeyObject`.
    *
    * It is recommended to encode public keys as `'spki'` and private keys as`'pkcs8'` with encryption for long-term storage:
    *
    * ```js
    * const {
    *   generateKeyPair,
    * } = await import('crypto');
    *
    * generateKeyPair('rsa', {
    *   modulusLength: 4096,
    *   publicKeyEncoding: {
    *     type: 'spki',
    *     format: 'pem'
    *   },
    *   privateKeyEncoding: {
    *     type: 'pkcs8',
    *     format: 'pem',
    *     cipher: 'aes-256-cbc',
    *     passphrase: 'top secret'
    *   }
    * }, (err, publicKey, privateKey) => {
    *   // Handle errors and use the generated key pair.
    * });
    * ```
    *
    * ```js
    * const {
    *   generateKeyPair,
    * } = require('crypto');
    *
    * generateKeyPair('rsa', {
    *   modulusLength: 4096,
    *   publicKeyEncoding: {
    *     type: 'spki',
    *     format: 'pem'
    *   },
    *   privateKeyEncoding: {
    *     type: 'pkcs8',
    *     format: 'pem',
    *     cipher: 'aes-256-cbc',
    *     passphrase: 'top secret'
    *   }
    * }, (err, publicKey, privateKey) => {
    *   // Handle errors and use the generated key pair.
    * });
    * ```
    *
    * On completion, `callback` will be called with `err` set to `undefined` and`publicKey` / `privateKey` representing the generated key pair.
    *
    * If this method is invoked as its `util.promisify()` ed version, it returns
    * a `Promise` for an `Object` with `publicKey` and `privateKey` properties.
    * @since v10.12.0
    * @param type Must be `'rsa'`, `'dsa'`, `'ec'`, `'ed25519'`, `'ed448'`, `'x25519'`, `'x448'`, or `'dh'`.
    */
  @scala.inline
  def generateKeyPair(
    `type`: rsa,
    options: RSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x25519,
    options: Unit,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x25519,
    options: X25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x25519,
    options: X25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x448,
    options: Unit,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x448,
    options: X448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ tmttyped.node.cryptoMod.KeyObject, 
      /* privateKey */ tmttyped.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateKeyPair(
    `type`: x448,
    options: X448KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ Buffer) | (/* privateKey */ java.lang.String), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def generateKeyPairSync(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(`type`: ed25519, options: ED25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(`type`: ed448, options: ED448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[java.lang.String, java.lang.String]]
  /**
    * Generates a new asymmetric key pair of the given `type`. RSA, DSA, EC, Ed25519,
    * Ed448, X25519, X448, and DH are currently supported.
    *
    * If a `publicKeyEncoding` or `privateKeyEncoding` was specified, this function
    * behaves as if `keyObject.export()` had been called on its result. Otherwise,
    * the respective part of the key is returned as a `KeyObject`.
    *
    * When encoding public keys, it is recommended to use `'spki'`. When encoding
    * private keys, it is recommended to use `'pkcs8'` with a strong passphrase,
    * and to keep the passphrase confidential.
    *
    * ```js
    * const {
    *   generateKeyPairSync,
    * } = await import('crypto');
    *
    * const {
    *   publicKey,
    *   privateKey,
    * } = generateKeyPairSync('rsa', {
    *   modulusLength: 4096,
    *   publicKeyEncoding: {
    *     type: 'spki',
    *     format: 'pem'
    *   },
    *   privateKeyEncoding: {
    *     type: 'pkcs8',
    *     format: 'pem',
    *     cipher: 'aes-256-cbc',
    *     passphrase: 'top secret'
    *   }
    * });
    * ```
    *
    * ```js
    * const {
    *   generateKeyPairSync,
    * } = require('crypto');
    *
    * const {
    *   publicKey,
    *   privateKey,
    * } = generateKeyPairSync('rsa', {
    *   modulusLength: 4096,
    *   publicKeyEncoding: {
    *     type: 'spki',
    *     format: 'pem'
    *   },
    *   privateKeyEncoding: {
    *     type: 'pkcs8',
    *     format: 'pem',
    *     cipher: 'aes-256-cbc',
    *     passphrase: 'top secret'
    *   }
    * });
    * ```
    *
    * The return value `{ publicKey, privateKey }` represents the generated key pair.
    * When PEM encoding was selected, the respective key will be a string, otherwise
    * it will be a buffer containing the data encoded as DER.
    * @since v10.12.0
    * @param type Must be `'rsa'`, `'dsa'`, `'ec'`, `'ed25519'`, `'ed448'`, `'x25519'`, `'x448'`, or `'dh'`.
    */
  @scala.inline
  def generateKeyPairSync(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(`type`: x25519, options: X25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(`type`: x448, options: X448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[java.lang.String, java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[java.lang.String, java.lang.String]]
  
  @scala.inline
  def generateKeyPairSync_dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ec(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed25519(`type`: ed25519): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed25519(`type`: ed25519, options: ED25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed448(`type`: ed448): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed448(`type`: ed448, options: ED448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x25519(`type`: x25519): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x25519(`type`: x25519, options: X25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x448(`type`: x448): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x448(`type`: x448, options: X448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKey_aes(
    `type`: aes,
    options: Length,
    callback: js.Function2[/* err */ js.Error | Null, /* key */ tmttyped.node.cryptoMod.KeyObject, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Asynchronously generates a new random secret key of the given `length`. The`type` will determine which validations will be performed on the `length`.
    *
    * ```js
    * const {
    *   generateKey,
    * } = await import('crypto');
    *
    * generateKey('hmac', { length: 64 }, (err, key) => {
    *   if (err) throw err;
    *   console.log(key.export().toString('hex'));  // 46e..........620
    * });
    * ```
    *
    * ```js
    * const {
    *   generateKey,
    * } = require('crypto');
    *
    * generateKey('hmac', { length: 64 }, (err, key) => {
    *   if (err) throw err;
    *   console.log(key.export().toString('hex'));  // 46e..........620
    * });
    * ```
    * @since v15.0.0
    * @param type The intended use of the generated secret key. Currently accepted values are `'hmac'` and `'aes'`.
    */
  @scala.inline
  def generateKey_hmac(
    `type`: hmac,
    options: Length,
    callback: js.Function2[/* err */ js.Error | Null, /* key */ tmttyped.node.cryptoMod.KeyObject, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Generates a pseudorandom prime of `size` bits.
    *
    * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
    *
    * The `options.add` and `options.rem` parameters can be used to enforce additional
    * requirements, e.g., for Diffie-Hellman:
    *
    * * If `options.add` and `options.rem` are both set, the prime will satisfy the
    * condition that `prime % add = rem`.
    * * If only `options.add` is set and `options.safe` is not `true`, the prime will
    * satisfy the condition that `prime % add = 1`.
    * * If only `options.add` is set and `options.safe` is set to `true`, the prime
    * will instead satisfy the condition that `prime % add = 3`. This is necessary
    * because `prime % add = 1` for `options.add > 2` would contradict the condition
    * enforced by `options.safe`.
    * * `options.rem` is ignored if `options.add` is not given.
    *
    * Both `options.add` and `options.rem` must be encoded as big-endian sequences
    * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
    *
    * By default, the prime is encoded as a big-endian sequence of octets
    * in an [&lt;ArrayBuffer&gt;](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
    * [&lt;bigint&gt;](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt)is provided.
    * @since v15.8.0
    * @param size The size (in bits) of the prime to generate.
    */
  @scala.inline
  def generatePrime(
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.typedarray.ArrayBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generatePrime(
    size: Double,
    options: GeneratePrimeOptionsArrayBuffer,
    callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.typedarray.ArrayBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generatePrime(
    size: Double,
    options: GeneratePrimeOptionsBigInt,
    callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.BigInt, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generatePrime(
    size: Double,
    options: GeneratePrimeOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.typedarray.ArrayBuffer | js.BigInt, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Generates a pseudorandom prime of `size` bits.
    *
    * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
    *
    * The `options.add` and `options.rem` parameters can be used to enforce additional
    * requirements, e.g., for Diffie-Hellman:
    *
    * * If `options.add` and `options.rem` are both set, the prime will satisfy the
    * condition that `prime % add = rem`.
    * * If only `options.add` is set and `options.safe` is not `true`, the prime will
    * satisfy the condition that `prime % add = 1`.
    * * If only `options.add` is set and `options.safe` is set to `true`, the prime
    * will instead satisfy the condition that `prime % add = 3`. This is necessary
    * because `prime % add = 1` for `options.add > 2` would contradict the condition
    * enforced by `options.safe`.
    * * `options.rem` is ignored if `options.add` is not given.
    *
    * Both `options.add` and `options.rem` must be encoded as big-endian sequences
    * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
    *
    * By default, the prime is encoded as a big-endian sequence of octets
    * in an [&lt;ArrayBuffer&gt;](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
    * [&lt;bigint&gt;](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt)is provided.
    * @since v15.8.0
    * @param size The size (in bits) of the prime to generate.
    */
  @scala.inline
  def generatePrimeSync(size: Double): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  @scala.inline
  def generatePrimeSync(size: Double, options: GeneratePrimeOptions): js.typedarray.ArrayBuffer | js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer | js.BigInt]
  @scala.inline
  def generatePrimeSync(size: Double, options: GeneratePrimeOptionsArrayBuffer): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  @scala.inline
  def generatePrimeSync(size: Double, options: GeneratePrimeOptionsBigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  /**
    * Returns information about a given cipher.
    *
    * Some ciphers accept variable length keys and initialization vectors. By default,
    * the `crypto.getCipherInfo()` method will return the default values for these
    * ciphers. To test if a given key length or iv length is acceptable for given
    * cipher, use the `keyLength` and `ivLength` options. If the given values are
    * unacceptable, `undefined` will be returned.
    * @since v15.0.0
    * @param nameOrNid The name or nid of the cipher to query.
    */
  @scala.inline
  def getCipherInfo(nameOrNid: java.lang.String): js.UndefOr[CipherInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CipherInfo]]
  @scala.inline
  def getCipherInfo(nameOrNid: java.lang.String, options: CipherInfoOptions): js.UndefOr[CipherInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CipherInfo]]
  @scala.inline
  def getCipherInfo(nameOrNid: Double): js.UndefOr[CipherInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CipherInfo]]
  @scala.inline
  def getCipherInfo(nameOrNid: Double, options: CipherInfoOptions): js.UndefOr[CipherInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CipherInfo]]
  
  /**
    * ```js
    * const {
    *   getCiphers,
    * } = await import('crypto');
    *
    * console.log(getCiphers()); // ['aes-128-cbc', 'aes-128-ccm', ...]
    * ```
    *
    * ```js
    * const {
    *   getCiphers,
    * } = require('crypto');
    *
    * console.log(getCiphers()); // ['aes-128-cbc', 'aes-128-ccm', ...]
    * ```
    * @since v0.9.3
    * @return An array with the names of the supported cipher algorithms.
    */
  @scala.inline
  def getCiphers(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[java.lang.String]]
  
  /**
    * ```js
    * const {
    *   getCurves,
    * } = await import('crypto');
    *
    * console.log(getCurves()); // ['Oakley-EC2N-3', 'Oakley-EC2N-4', ...]
    * ```
    *
    * ```js
    * const {
    *   getCurves,
    * } = require('crypto');
    *
    * console.log(getCurves()); // ['Oakley-EC2N-3', 'Oakley-EC2N-4', ...]
    * ```
    * @since v2.3.0
    * @return An array with the names of the supported elliptic curves.
    */
  @scala.inline
  def getCurves(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurves")().asInstanceOf[js.Array[java.lang.String]]
  
  /**
    * Creates a predefined `DiffieHellmanGroup` key exchange object. The
    * supported groups are: `'modp1'`, `'modp2'`, `'modp5'` (defined in[RFC 2412](https://www.rfc-editor.org/rfc/rfc2412.txt), but see `Caveats`) and `'modp14'`, `'modp15'`,`'modp16'`, `'modp17'`,
    * `'modp18'` (defined in [RFC 3526](https://www.rfc-editor.org/rfc/rfc3526.txt)). The
    * returned object mimics the interface of objects created by {@link createDiffieHellman}, but will not allow changing
    * the keys (with `diffieHellman.setPublicKey()`, for example). The
    * advantage of using this method is that the parties do not have to
    * generate nor exchange a group modulus beforehand, saving both processor
    * and communication time.
    *
    * Example (obtaining a shared secret):
    *
    * ```js
    * const {
    *   getDiffieHellman,
    * } = await import('crypto');
    * const alice = getDiffieHellman('modp14');
    * const bob = getDiffieHellman('modp14');
    *
    * alice.generateKeys();
    * bob.generateKeys();
    *
    * const aliceSecret = alice.computeSecret(bob.getPublicKey(), null, 'hex');
    * const bobSecret = bob.computeSecret(alice.getPublicKey(), null, 'hex');
    *
    * // aliceSecret and bobSecret should be the same
    * console.log(aliceSecret === bobSecret);
    * ```
    *
    * ```js
    * const {
    *   getDiffieHellman,
    * } = require('crypto');
    *
    * const alice = getDiffieHellman('modp14');
    * const bob = getDiffieHellman('modp14');
    *
    * alice.generateKeys();
    * bob.generateKeys();
    *
    * const aliceSecret = alice.computeSecret(bob.getPublicKey(), null, 'hex');
    * const bobSecret = bob.computeSecret(alice.getPublicKey(), null, 'hex');
    *
    * // aliceSecret and bobSecret should be the same
    * console.log(aliceSecret === bobSecret);
    * ```
    * @since v0.7.5
    */
  @scala.inline
  def getDiffieHellman(group_name: java.lang.String): tmttyped.node.cryptoMod.DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(group_name.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.cryptoMod.DiffieHellman_]
  
  /**
    * @since v10.0.0
    * @return `1` if and only if a FIPS compliant crypto provider is currently in use, `0` otherwise. A future semver-major release may change the return type of this API to a {boolean}.
    */
  @scala.inline
  def getFips(): `1` | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("getFips")().asInstanceOf[`1` | `0`]
  
  /**
    * ```js
    * const {
    *   getHashes,
    * } = await import('crypto');
    *
    * console.log(getHashes()); // ['DSA', 'DSA-SHA', 'DSA-SHA1', ...]
    * ```
    *
    * ```js
    * const {
    *   getHashes,
    * } = require('crypto');
    *
    * console.log(getHashes()); // ['DSA', 'DSA-SHA', 'DSA-SHA1', ...]
    * ```
    * @since v0.9.3
    * @return An array of the names of the supported hash algorithms, such as `'RSA-SHA256'`. Hash algorithms are also called "digest" algorithms.
    */
  @scala.inline
  def getHashes(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashes")().asInstanceOf[js.Array[java.lang.String]]
  
  /**
    * HKDF is a simple key derivation function defined in RFC 5869\. The given `key`,`salt` and `info` are used with the `digest` to derive a key of `keylen` bytes.
    *
    * The supplied `callback` function is called with two arguments: `err` and`derivedKey`. If an errors occurs while deriving the key, `err` will be set;
    * otherwise `err` will be `null`. The successfully generated `derivedKey` will
    * be passed to the callback as an [&lt;ArrayBuffer&gt;](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). An error will be thrown if any
    * of the input arguments specify invalid values or types.
    *
    * ```js
    * const {
    *   hkdf,
    * } = await import('crypto');
    *
    * hkdf('sha512', 'key', 'salt', 'info', 64, (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(Buffer.from(derivedKey).toString('hex'));  // '24156e2...5391653'
    * });
    * ```
    *
    * ```js
    * const {
    *   hkdf,
    * } = require('crypto');
    *
    * hkdf('sha512', 'key', 'salt', 'info', 64, (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(Buffer.from(derivedKey).toString('hex'));  // '24156e2...5391653'
    * });
    * ```
    * @since v15.0.0
    * @param digest The digest algorithm to use.
    * @param key The secret key. It must be at least one byte in length.
    * @param salt The salt value. Must be provided but can be zero-length.
    * @param info Additional info value. Must be provided but can be zero-length, and cannot be more than 1024 bytes.
    * @param keylen The length of the key to generate. Must be greater than 0. The maximum allowable value is `255` times the number of bytes produced by the selected digest function (e.g. `sha512`
    * generates 64-byte hashes, making the maximum HKDF output 16320 bytes).
    */
  @scala.inline
  def hkdf(
    digest: java.lang.String,
    key: BinaryLike,
    salt: BinaryLike,
    info: BinaryLike,
    keylen: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ js.typedarray.ArrayBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def hkdf(
    digest: java.lang.String,
    key: tmttyped.node.cryptoMod.KeyObject,
    salt: BinaryLike,
    info: BinaryLike,
    keylen: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ js.typedarray.ArrayBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Provides a synchronous HKDF key derivation function as defined in RFC 5869\. The
    * given `key`, `salt` and `info` are used with the `digest` to derive a key of`keylen` bytes.
    *
    * The successfully generated `derivedKey` will be returned as an [&lt;ArrayBuffer&gt;](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer).
    *
    * An error will be thrown if any of the input arguments specify invalid values or
    * types, or if the derived key cannot be generated.
    *
    * ```js
    * const {
    *   hkdfSync,
    * } = await import('crypto');
    *
    * const derivedKey = hkdfSync('sha512', 'key', 'salt', 'info', 64);
    * console.log(Buffer.from(derivedKey).toString('hex'));  // '24156e2...5391653'
    * ```
    *
    * ```js
    * const {
    *   hkdfSync,
    * } = require('crypto');
    *
    * const derivedKey = hkdfSync('sha512', 'key', 'salt', 'info', 64);
    * console.log(Buffer.from(derivedKey).toString('hex'));  // '24156e2...5391653'
    * ```
    * @since v15.0.0
    * @param digest The digest algorithm to use.
    * @param key The secret key. It must be at least one byte in length.
    * @param salt The salt value. Must be provided but can be zero-length.
    * @param info Additional info value. Must be provided but can be zero-length, and cannot be more than 1024 bytes.
    * @param keylen The length of the key to generate. Must be greater than 0. The maximum allowable value is `255` times the number of bytes produced by the selected digest function (e.g. `sha512`
    * generates 64-byte hashes, making the maximum HKDF output 16320 bytes).
    */
  @scala.inline
  def hkdfSync(digest: java.lang.String, key: BinaryLike, salt: BinaryLike, info: BinaryLike, keylen: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdfSync")(digest.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  @scala.inline
  def hkdfSync(
    digest: java.lang.String,
    key: tmttyped.node.cryptoMod.KeyObject,
    salt: BinaryLike,
    info: BinaryLike,
    keylen: Double
  ): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdfSync")(digest.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * Provides an asynchronous Password-Based Key Derivation Function 2 (PBKDF2)
    * implementation. A selected HMAC digest algorithm specified by `digest` is
    * applied to derive a key of the requested byte length (`keylen`) from the`password`, `salt` and `iterations`.
    *
    * The supplied `callback` function is called with two arguments: `err` and`derivedKey`. If an error occurs while deriving the key, `err` will be set;
    * otherwise `err` will be `null`. By default, the successfully generated`derivedKey` will be passed to the callback as a `Buffer`. An error will be
    * thrown if any of the input arguments specify invalid values or types.
    *
    * If `digest` is `null`, `'sha1'` will be used. This behavior is deprecated,
    * please specify a `digest` explicitly.
    *
    * The `iterations` argument must be a number set as high as possible. The
    * higher the number of iterations, the more secure the derived key will be,
    * but will take a longer amount of time to complete.
    *
    * The `salt` should be as unique as possible. It is recommended that a salt is
    * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
    *
    * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
    *
    * ```js
    * const {
    *   pbkdf2,
    * } = await import('crypto');
    *
    * pbkdf2('secret', 'salt', 100000, 64, 'sha512', (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
    * });
    * ```
    *
    * ```js
    * const {
    *   pbkdf2,
    * } = require('crypto');
    *
    * pbkdf2('secret', 'salt', 100000, 64, 'sha512', (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
    * });
    * ```
    *
    * The `crypto.DEFAULT_ENCODING` property can be used to change the way the`derivedKey` is passed to the callback. This property, however, has been
    * deprecated and use should be avoided.
    *
    * ```js
    * const crypto = await import('crypto');
    * crypto.DEFAULT_ENCODING = 'hex';
    * crypto.pbkdf2('secret', 'salt', 100000, 512, 'sha512', (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(derivedKey);  // '3745e48...aa39b34'
    * });
    * ```
    *
    * ```js
    * const crypto = require('crypto');
    * crypto.DEFAULT_ENCODING = 'hex';
    * crypto.pbkdf2('secret', 'salt', 100000, 512, 'sha512', (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(derivedKey);  // '3745e48...aa39b34'
    * });
    * ```
    *
    * An array of supported digest functions can be retrieved using {@link getHashes}.
    *
    * This API uses libuv's threadpool, which can have surprising and
    * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
    * @since v0.5.5
    */
  @scala.inline
  def pbkdf2(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Provides a synchronous Password-Based Key Derivation Function 2 (PBKDF2)
    * implementation. A selected HMAC digest algorithm specified by `digest` is
    * applied to derive a key of the requested byte length (`keylen`) from the`password`, `salt` and `iterations`.
    *
    * If an error occurs an `Error` will be thrown, otherwise the derived key will be
    * returned as a `Buffer`.
    *
    * If `digest` is `null`, `'sha1'` will be used. This behavior is deprecated,
    * please specify a `digest` explicitly.
    *
    * The `iterations` argument must be a number set as high as possible. The
    * higher the number of iterations, the more secure the derived key will be,
    * but will take a longer amount of time to complete.
    *
    * The `salt` should be as unique as possible. It is recommended that a salt is
    * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
    *
    * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
    *
    * ```js
    * const {
    *   pbkdf2Sync,
    * } = await import('crypto');
    *
    * const key = pbkdf2Sync('secret', 'salt', 100000, 64, 'sha512');
    * console.log(key.toString('hex'));  // '3745e48...08d59ae'
    * ```
    *
    * ```js
    * const {
    *   pbkdf2Sync,
    * } = require('crypto');
    *
    * const key = pbkdf2Sync('secret', 'salt', 100000, 64, 'sha512');
    * console.log(key.toString('hex'));  // '3745e48...08d59ae'
    * ```
    *
    * The `crypto.DEFAULT_ENCODING` property may be used to change the way the`derivedKey` is returned. This property, however, is deprecated and use
    * should be avoided.
    *
    * ```js
    * const crypto = await import('crypto');
    * crypto.DEFAULT_ENCODING = 'hex';
    * const key = crypto.pbkdf2Sync('secret', 'salt', 100000, 512, 'sha512');
    * console.log(key);  // '3745e48...aa39b34'
    * ```
    *
    * ```js
    * const crypto = require('crypto');
    * crypto.DEFAULT_ENCODING = 'hex';
    * const key = crypto.pbkdf2Sync('secret', 'salt', 100000, 512, 'sha512');
    * console.log(key);  // '3745e48...aa39b34'
    * ```
    *
    * An array of supported digest functions can be retrieved using {@link getHashes}.
    * @since v0.9.3
    */
  @scala.inline
  def pbkdf2Sync(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: java.lang.String
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def privateDecrypt(private_key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  /**
    * Decrypts `buffer` with `privateKey`. `buffer` was previously encrypted using
    * the corresponding public key, for example using {@link publicEncrypt}.
    *
    * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
    * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_OAEP_PADDING`.
    * @since v0.11.14
    */
  @scala.inline
  def privateDecrypt(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def privateEncrypt(private_key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  /**
    * Encrypts `buffer` with `privateKey`. The returned data can be decrypted using
    * the corresponding public key, for example using {@link publicDecrypt}.
    *
    * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
    * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
    * @since v1.1.0
    */
  @scala.inline
  def privateEncrypt(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def pseudoRandomBytes(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def pseudoRandomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def publicDecrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def publicDecrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  /**
    * Decrypts `buffer` with `key`.`buffer` was previously encrypted using
    * the corresponding private key, for example using {@link privateEncrypt}.
    *
    * If `key` is not a `KeyObject`, this function behaves as if`key` had been passed to {@link createPublicKey}. If it is an
    * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
    *
    * Because RSA public keys can be derived from private keys, a private key may
    * be passed instead of a public key.
    * @since v1.1.0
    */
  @scala.inline
  def publicDecrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def publicEncrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def publicEncrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  /**
    * Encrypts the content of `buffer` with `key` and returns a new `Buffer` with encrypted content. The returned data can be decrypted using
    * the corresponding private key, for example using {@link privateDecrypt}.
    *
    * If `key` is not a `KeyObject`, this function behaves as if`key` had been passed to {@link createPublicKey}. If it is an
    * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_OAEP_PADDING`.
    *
    * Because RSA public keys can be derived from private keys, a private key may
    * be passed instead of a public key.
    * @since v0.11.14
    */
  @scala.inline
  def publicEncrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * Generates cryptographically strong pseudorandom data. The `size` argument
    * is a number indicating the number of bytes to generate.
    *
    * If a `callback` function is provided, the bytes are generated asynchronously
    * and the `callback` function is invoked with two arguments: `err` and `buf`.
    * If an error occurs, `err` will be an `Error` object; otherwise it is `null`. The`buf` argument is a `Buffer` containing the generated bytes.
    *
    * ```js
    * // Asynchronous
    * const {
    *   randomBytes,
    * } = await import('crypto');
    *
    * randomBytes(256, (err, buf) => {
    *   if (err) throw err;
    *   console.log(`${buf.length} bytes of random data: ${buf.toString('hex')}`);
    * });
    * ```
    *
    * ```js
    * // Asynchronous
    * const {
    *   randomBytes,
    * } = require('crypto');
    *
    * randomBytes(256, (err, buf) => {
    *   if (err) throw err;
    *   console.log(`${buf.length} bytes of random data: ${buf.toString('hex')}`);
    * });
    * ```
    *
    * If the `callback` function is not provided, the random bytes are generated
    * synchronously and returned as a `Buffer`. An error will be thrown if
    * there is a problem generating the bytes.
    *
    * ```js
    * // Synchronous
    * const {
    *   randomBytes,
    * } = await import('crypto');
    *
    * const buf = randomBytes(256);
    * console.log(
    *   `${buf.length} bytes of random data: ${buf.toString('hex')}`);
    * ```
    *
    * ```js
    * // Synchronous
    * const {
    *   randomBytes,
    * } = require('crypto');
    *
    * const buf = randomBytes(256);
    * console.log(
    *   `${buf.length} bytes of random data: ${buf.toString('hex')}`);
    * ```
    *
    * The `crypto.randomBytes()` method will not complete until there is
    * sufficient entropy available.
    * This should normally never take longer than a few milliseconds. The only time
    * when generating the random bytes may conceivably block for a longer period of
    * time is right after boot, when the whole system is still low on entropy.
    *
    * This API uses libuv's threadpool, which can have surprising and
    * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
    *
    * The asynchronous version of `crypto.randomBytes()` is carried out in a single
    * threadpool request. To minimize threadpool task length variation, partition
    * large `randomBytes` requests when doing so as part of fulfilling a client
    * request.
    * @since v0.5.8
    * @param size The number of bytes to generate. The `size` must not be larger than `2**31 - 1`.
    * @return if the `callback` function is not provided.
    */
  @scala.inline
  def randomBytes(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def randomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def randomFill(
    buffer: js.typedarray.DataView,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.DataView,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.DataView,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.DataView, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float32Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float32Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float64Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float64Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float64Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int16Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int16Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int32Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int32Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int8Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int8Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint16Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint32Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * This function is similar to {@link randomBytes} but requires the first
    * argument to be a `Buffer` that will be filled. It also
    * requires that a callback is passed in.
    *
    * If the `callback` function is not provided, an error will be thrown.
    *
    * ```js
    * const {
    *   randomFill,
    * } = await import('crypto');
    *
    * const buf = Buffer.alloc(10);
    * randomFill(buf, (err, buf) => {
    *   if (err) throw err;
    *   console.log(buf.toString('hex'));
    * });
    *
    * randomFill(buf, 5, (err, buf) => {
    *   if (err) throw err;
    *   console.log(buf.toString('hex'));
    * });
    *
    * // The above is equivalent to the following:
    * randomFill(buf, 5, 5, (err, buf) => {
    *   if (err) throw err;
    *   console.log(buf.toString('hex'));
    * });
    * ```
    *
    * ```js
    * const {
    *   randomFill,
    * } = require('crypto');
    *
    * const buf = Buffer.alloc(10);
    * randomFill(buf, (err, buf) => {
    *   if (err) throw err;
    *   console.log(buf.toString('hex'));
    * });
    *
    * randomFill(buf, 5, (err, buf) => {
    *   if (err) throw err;
    *   console.log(buf.toString('hex'));
    * });
    *
    * // The above is equivalent to the following:
    * randomFill(buf, 5, 5, (err, buf) => {
    *   if (err) throw err;
    *   console.log(buf.toString('hex'));
    * });
    * ```
    *
    * Any `ArrayBuffer`, `TypedArray`, or `DataView` instance may be passed as`buffer`.
    *
    * While this includes instances of `Float32Array` and `Float64Array`, this
    * function should not be used to generate random floating-point numbers. The
    * result may contain `+Infinity`, `-Infinity`, and `NaN`, and even if the array
    * contains finite numbers only, they are not drawn from a uniform random
    * distribution and have no meaningful lower or upper bounds.
    *
    * ```js
    * const {
    *   randomFill,
    * } = await import('crypto');
    *
    * const a = new Uint32Array(10);
    * randomFill(a, (err, buf) => {
    *   if (err) throw err;
    *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
    *     .toString('hex'));
    * });
    *
    * const b = new DataView(new ArrayBuffer(10));
    * randomFill(b, (err, buf) => {
    *   if (err) throw err;
    *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
    *     .toString('hex'));
    * });
    *
    * const c = new ArrayBuffer(10);
    * randomFill(c, (err, buf) => {
    *   if (err) throw err;
    *   console.log(Buffer.from(buf).toString('hex'));
    * });
    * ```
    *
    * ```js
    * const {
    *   randomFill,
    * } = require('crypto');
    *
    * const a = new Uint32Array(10);
    * randomFill(a, (err, buf) => {
    *   if (err) throw err;
    *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
    *     .toString('hex'));
    * });
    *
    * const b = new DataView(new ArrayBuffer(10));
    * randomFill(b, (err, buf) => {
    *   if (err) throw err;
    *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
    *     .toString('hex'));
    * });
    *
    * const c = new ArrayBuffer(10);
    * randomFill(c, (err, buf) => {
    *   if (err) throw err;
    *   console.log(Buffer.from(buf).toString('hex'));
    * });
    * ```
    *
    * This API uses libuv's threadpool, which can have surprising and
    * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
    *
    * The asynchronous version of `crypto.randomFill()` is carried out in a single
    * threadpool request. To minimize threadpool task length variation, partition
    * large `randomFill` requests when doing so as part of fulfilling a client
    * request.
    * @since v7.10.0, v6.13.0
    * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
    * @param callback `function(err, buf) {}`.
    */
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8ClampedArray, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: BigInt64Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigInt64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: BigInt64Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigInt64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: BigInt64Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigInt64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: BigUint64Array,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigUint64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: BigUint64Array,
    offset: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigUint64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomFill(
    buffer: BigUint64Array,
    offset: Double,
    size: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigUint64Array, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView, offset: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView, offset: Double, size: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView, offset: Unit, size: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array): js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: Double, size: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: Unit, size: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array): js.typedarray.Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: Double): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: Double, size: Double): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: Unit, size: Double): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array): js.typedarray.Int16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: Double): js.typedarray.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: Double, size: Double): js.typedarray.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: Unit, size: Double): js.typedarray.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array): js.typedarray.Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: Double, size: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: Unit, size: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array): js.typedarray.Int8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: Double): js.typedarray.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: Double, size: Double): js.typedarray.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: Unit, size: Double): js.typedarray.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array): js.typedarray.Uint16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: Double, size: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: Unit, size: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array): js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: Double, size: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: Unit, size: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  /**
    * Synchronous version of {@link randomFill}.
    *
    * ```js
    * const {
    *   randomFillSync,
    * } = await import('crypto');
    *
    * const buf = Buffer.alloc(10);
    * console.log(randomFillSync(buf).toString('hex'));
    *
    * randomFillSync(buf, 5);
    * console.log(buf.toString('hex'));
    *
    * // The above is equivalent to the following:
    * randomFillSync(buf, 5, 5);
    * console.log(buf.toString('hex'));
    * ```
    *
    * ```js
    * const {
    *   randomFillSync,
    * } = require('crypto');
    *
    * const buf = Buffer.alloc(10);
    * console.log(randomFillSync(buf).toString('hex'));
    *
    * randomFillSync(buf, 5);
    * console.log(buf.toString('hex'));
    *
    * // The above is equivalent to the following:
    * randomFillSync(buf, 5, 5);
    * console.log(buf.toString('hex'));
    * ```
    *
    * Any `ArrayBuffer`, `TypedArray` or `DataView` instance may be passed as`buffer`.
    *
    * ```js
    * const {
    *   randomFillSync,
    * } = await import('crypto');
    *
    * const a = new Uint32Array(10);
    * console.log(Buffer.from(randomFillSync(a).buffer,
    *                         a.byteOffset, a.byteLength).toString('hex'));
    *
    * const b = new DataView(new ArrayBuffer(10));
    * console.log(Buffer.from(randomFillSync(b).buffer,
    *                         b.byteOffset, b.byteLength).toString('hex'));
    *
    * const c = new ArrayBuffer(10);
    * console.log(Buffer.from(randomFillSync(c)).toString('hex'));
    * ```
    *
    * ```js
    * const {
    *   randomFillSync,
    * } = require('crypto');
    *
    * const a = new Uint32Array(10);
    * console.log(Buffer.from(randomFillSync(a).buffer,
    *                         a.byteOffset, a.byteLength).toString('hex'));
    *
    * const b = new DataView(new ArrayBuffer(10));
    * console.log(Buffer.from(randomFillSync(b).buffer,
    *                         b.byteOffset, b.byteLength).toString('hex'));
    *
    * const c = new ArrayBuffer(10);
    * console.log(Buffer.from(randomFillSync(c)).toString('hex'));
    * ```
    * @since v7.10.0, v6.13.0
    * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
    * @return The object passed as `buffer` argument.
    */
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: Double, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: Unit, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: Double): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: Double, size: Double): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: Unit, size: Double): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: BigInt64Array): BigInt64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[BigInt64Array]
  @scala.inline
  def randomFillSync(buffer: BigInt64Array, offset: Double): BigInt64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[BigInt64Array]
  @scala.inline
  def randomFillSync(buffer: BigInt64Array, offset: Double, size: Double): BigInt64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BigInt64Array]
  @scala.inline
  def randomFillSync(buffer: BigInt64Array, offset: Unit, size: Double): BigInt64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BigInt64Array]
  @scala.inline
  def randomFillSync(buffer: BigUint64Array): BigUint64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[BigUint64Array]
  @scala.inline
  def randomFillSync(buffer: BigUint64Array, offset: Double): BigUint64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[BigUint64Array]
  @scala.inline
  def randomFillSync(buffer: BigUint64Array, offset: Double, size: Double): BigUint64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BigUint64Array]
  @scala.inline
  def randomFillSync(buffer: BigUint64Array, offset: Unit, size: Double): BigUint64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BigUint64Array]
  
  /**
    * Return a random integer `n` such that `min <= n < max`.  This
    * implementation avoids [modulo bias](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#Modulo_bias).
    *
    * The range (`max - min`) must be less than 248. `min` and `max` must
    * be [safe integers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger).
    *
    * If the `callback` function is not provided, the random integer is
    * generated synchronously.
    *
    * ```js
    * // Asynchronous
    * const {
    *   randomInt,
    * } = await import('crypto');
    *
    * randomInt(3, (err, n) => {
    *   if (err) throw err;
    *   console.log(`Random number chosen from (0, 1, 2): ${n}`);
    * });
    * ```
    *
    * ```js
    * // Asynchronous
    * const {
    *   randomInt,
    * } = require('crypto');
    *
    * randomInt(3, (err, n) => {
    *   if (err) throw err;
    *   console.log(`Random number chosen from (0, 1, 2): ${n}`);
    * });
    * ```
    *
    * ```js
    * // Synchronous
    * const {
    *   randomInt,
    * } = await import('crypto');
    *
    * const n = randomInt(3);
    * console.log(`Random number chosen from (0, 1, 2): ${n}`);
    * ```
    *
    * ```js
    * // Synchronous
    * const {
    *   randomInt,
    * } = require('crypto');
    *
    * const n = randomInt(3);
    * console.log(`Random number chosen from (0, 1, 2): ${n}`);
    * ```
    *
    * ```js
    * // With `min` argument
    * const {
    *   randomInt,
    * } = await import('crypto');
    *
    * const n = randomInt(1, 7);
    * console.log(`The dice rolled: ${n}`);
    * ```
    *
    * ```js
    * // With `min` argument
    * const {
    *   randomInt,
    * } = require('crypto');
    *
    * const n = randomInt(1, 7);
    * console.log(`The dice rolled: ${n}`);
    * ```
    * @since v14.10.0, v12.19.0
    * @param min Start of random range (inclusive).
    * @param max End of random range (exclusive).
    * @param callback `function(err, n) {}`.
    */
  @scala.inline
  def randomInt(max: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def randomInt(max: Double, callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def randomInt(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def randomInt(
    min: Double,
    max: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Generates a random [RFC 4122](https://www.rfc-editor.org/rfc/rfc4122.txt) Version 4 UUID. The UUID is generated using a
    * cryptographic pseudorandom number generator.
    * @since v15.6.0
    */
  @scala.inline
  def randomUUID(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUUID")().asInstanceOf[java.lang.String]
  @scala.inline
  def randomUUID(options: RandomUUIDOptions): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUUID")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * Provides an asynchronous [scrypt](https://en.wikipedia.org/wiki/Scrypt) implementation. Scrypt is a password-based
    * key derivation function that is designed to be expensive computationally and
    * memory-wise in order to make brute-force attacks unrewarding.
    *
    * The `salt` should be as unique as possible. It is recommended that a salt is
    * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
    *
    * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
    *
    * The `callback` function is called with two arguments: `err` and `derivedKey`.`err` is an exception object when key derivation fails, otherwise `err` is`null`. `derivedKey` is passed to the
    * callback as a `Buffer`.
    *
    * An exception is thrown when any of the input arguments specify invalid values
    * or types.
    *
    * ```js
    * const {
    *   scrypt,
    * } = await import('crypto');
    *
    * // Using the factory defaults.
    * scrypt('password', 'salt', 64, (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
    * });
    * // Using a custom N parameter. Must be a power of two.
    * scrypt('password', 'salt', 64, { N: 1024 }, (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(derivedKey.toString('hex'));  // '3745e48...aa39b34'
    * });
    * ```
    *
    * ```js
    * const {
    *   scrypt,
    * } = require('crypto');
    *
    * // Using the factory defaults.
    * scrypt('password', 'salt', 64, (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
    * });
    * // Using a custom N parameter. Must be a power of two.
    * scrypt('password', 'salt', 64, { N: 1024 }, (err, derivedKey) => {
    *   if (err) throw err;
    *   console.log(derivedKey.toString('hex'));  // '3745e48...aa39b34'
    * });
    * ```
    * @since v10.5.0
    */
  @scala.inline
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def scrypt(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Provides a synchronous [scrypt](https://en.wikipedia.org/wiki/Scrypt) implementation. Scrypt is a password-based
    * key derivation function that is designed to be expensive computationally and
    * memory-wise in order to make brute-force attacks unrewarding.
    *
    * The `salt` should be as unique as possible. It is recommended that a salt is
    * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
    *
    * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
    *
    * An exception is thrown when key derivation fails, otherwise the derived key is
    * returned as a `Buffer`.
    *
    * An exception is thrown when any of the input arguments specify invalid values
    * or types.
    *
    * ```js
    * const {
    *   scryptSync,
    * } = await import('crypto');
    * // Using the factory defaults.
    *
    * const key1 = scryptSync('password', 'salt', 64);
    * console.log(key1.toString('hex'));  // '3745e48...08d59ae'
    * // Using a custom N parameter. Must be a power of two.
    * const key2 = scryptSync('password', 'salt', 64, { N: 1024 });
    * console.log(key2.toString('hex'));  // '3745e48...aa39b34'
    * ```
    *
    * ```js
    * const {
    *   scryptSync,
    * } = require('crypto');
    * // Using the factory defaults.
    *
    * const key1 = scryptSync('password', 'salt', 64);
    * console.log(key1.toString('hex'));  // '3745e48...08d59ae'
    * // Using a custom N parameter. Must be a power of two.
    * const key2 = scryptSync('password', 'salt', 64, { N: 1024 });
    * console.log(key2.toString('hex'));  // '3745e48...aa39b34'
    * ```
    * @since v10.5.0
    */
  @scala.inline
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * @since v15.6.0
    */
  @scala.inline
  def secureHeapUsed(): SecureHeapUsage = ^.asInstanceOf[js.Dynamic].applyDynamic("secureHeapUsed")().asInstanceOf[SecureHeapUsage]
  
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a `KeyObject`, this function behaves as if `key` had been
    * passed to {@link createPrivateKey}. If it is an object, the following
    * additional properties can be passed:
    *
    * If the `callback` function is provided this function uses libuv's threadpool.
    * @since v12.0.0
    */
  @scala.inline
  def sign(algorithm: java.lang.String, data: ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: ArrayBufferView,
    key: KeyLike,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sign(algorithm: java.lang.String, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: ArrayBufferView,
    key: SignKeyObjectInput,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sign(algorithm: java.lang.String, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: ArrayBufferView,
    key: SignPrivateKeyInput,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sign(algorithm: Null, data: ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(
    algorithm: Null,
    data: ArrayBufferView,
    key: KeyLike,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sign(algorithm: Null, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(
    algorithm: Null,
    data: ArrayBufferView,
    key: SignKeyObjectInput,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sign(algorithm: Null, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(
    algorithm: Null,
    data: ArrayBufferView,
    key: SignPrivateKeyInput,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sign(algorithm: Unit, data: ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(
    algorithm: Unit,
    data: ArrayBufferView,
    key: KeyLike,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sign(algorithm: Unit, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(
    algorithm: Unit,
    data: ArrayBufferView,
    key: SignKeyObjectInput,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sign(algorithm: Unit, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def sign(
    algorithm: Unit,
    data: ArrayBufferView,
    key: SignPrivateKeyInput,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This function is based on a constant-time algorithm.
    * Returns true if `a` is equal to `b`, without leaking timing information that
    * would allow an attacker to guess one of the values. This is suitable for
    * comparing HMAC digests or secret values like authentication cookies or[capability urls](https://www.w3.org/TR/capability-urls/).
    *
    * `a` and `b` must both be `Buffer`s, `TypedArray`s, or `DataView`s, and they
    * must have the same byte length.
    *
    * If at least one of `a` and `b` is a `TypedArray` with more than one byte per
    * entry, such as `Uint16Array`, the result will be computed using the platform
    * byte order.
    *
    * Use of `crypto.timingSafeEqual` does not guarantee that the _surrounding_ code
    * is timing-safe. Care should be taken to ensure that the surrounding code does
    * not introduce timing vulnerabilities.
    * @since v6.6.0
    */
  @scala.inline
  def timingSafeEqual(a: ArrayBufferView, b: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("timingSafeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Verifies the given signature for `data` using the given key and algorithm. If`algorithm` is `null` or `undefined`, then the algorithm is dependent upon the
    * key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a `KeyObject`, this function behaves as if `key` had been
    * passed to {@link createPublicKey}. If it is an object, the following
    * additional properties can be passed:
    *
    * The `signature` argument is the previously calculated signature for the `data`.
    *
    * Because public keys can be derived from private keys, a private key or a public
    * key may be passed for `key`.
    *
    * If the `callback` function is provided this function uses libuv's threadpool.
    * @since v12.0.0
    */
  @scala.inline
  def verify(algorithm: java.lang.String, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: ArrayBufferView,
    key: KeyLike,
    signature: ArrayBufferView,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: ArrayBufferView,
    key: VerifyKeyObjectInput,
    signature: ArrayBufferView
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: ArrayBufferView,
    key: VerifyKeyObjectInput,
    signature: ArrayBufferView,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: ArrayBufferView,
    key: VerifyPublicKeyInput,
    signature: ArrayBufferView
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: ArrayBufferView,
    key: VerifyPublicKeyInput,
    signature: ArrayBufferView,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def verify(algorithm: Null, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(
    algorithm: Null,
    data: ArrayBufferView,
    key: KeyLike,
    signature: ArrayBufferView,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def verify(algorithm: Null, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(
    algorithm: Null,
    data: ArrayBufferView,
    key: VerifyKeyObjectInput,
    signature: ArrayBufferView,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def verify(algorithm: Null, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(
    algorithm: Null,
    data: ArrayBufferView,
    key: VerifyPublicKeyInput,
    signature: ArrayBufferView,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def verify(algorithm: Unit, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(
    algorithm: Unit,
    data: ArrayBufferView,
    key: KeyLike,
    signature: ArrayBufferView,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def verify(algorithm: Unit, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(
    algorithm: Unit,
    data: ArrayBufferView,
    key: VerifyKeyObjectInput,
    signature: ArrayBufferView,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def verify(algorithm: Unit, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def verify(
    algorithm: Unit,
    data: ArrayBufferView,
    key: VerifyPublicKeyInput,
    signature: ArrayBufferView,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object webcrypto {
    
    @JSImport("node:crypto", "webcrypto.CryptoKey")
    @js.native
    class CryptoKey ()
      extends tmttyped.node.cryptoMod.webcrypto.CryptoKey
  }
}

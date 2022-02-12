package tmttyped.node

import tmttyped.node.nodeNetMod.Socket
import tmttyped.node.tlsMod.ConnectionOptions
import tmttyped.node.tlsMod.PeerCertificate
import tmttyped.node.tlsMod.SecureContext
import tmttyped.node.tlsMod.SecureContextOptions
import tmttyped.node.tlsMod.SecurePair
import tmttyped.node.tlsMod.SecureVersion
import tmttyped.node.tlsMod.TLSSocketOptions
import tmttyped.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTlsMod {
  
  @JSImport("node:tls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:tls", "CLIENT_RENEG_LIMIT")
  @js.native
  val CLIENT_RENEG_LIMIT: Double = js.native
  
  @JSImport("node:tls", "CLIENT_RENEG_WINDOW")
  @js.native
  val CLIENT_RENEG_WINDOW: Double = js.native
  
  /**
    * The default curve name to use for ECDH key agreement in a tls server.
    * The default value is 'auto'. See tls.createSecureContext() for further
    * information.
    */
  @JSImport("node:tls", "DEFAULT_ECDH_CURVE")
  @js.native
  def DEFAULT_ECDH_CURVE: String = js.native
  @scala.inline
  def DEFAULT_ECDH_CURVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ECDH_CURVE")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the maxVersion option of
    * tls.createSecureContext(). It can be assigned any of the supported TLS
    * protocol versions, 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default:
    * 'TLSv1.3', unless changed using CLI options. Using --tls-max-v1.2 sets
    * the default to 'TLSv1.2'. Using --tls-max-v1.3 sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the highest maximum
    * is used.
    */
  @JSImport("node:tls", "DEFAULT_MAX_VERSION")
  @js.native
  def DEFAULT_MAX_VERSION: SecureVersion = js.native
  @scala.inline
  def DEFAULT_MAX_VERSION_=(x: SecureVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the minVersion option of tls.createSecureContext().
    * It can be assigned any of the supported TLS protocol versions,
    * 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default: 'TLSv1.2', unless
    * changed using CLI options. Using --tls-min-v1.0 sets the default to
    * 'TLSv1'. Using --tls-min-v1.1 sets the default to 'TLSv1.1'. Using
    * --tls-min-v1.3 sets the default to 'TLSv1.3'. If multiple of the options
    * are provided, the lowest minimum is used.
    */
  @JSImport("node:tls", "DEFAULT_MIN_VERSION")
  @js.native
  def DEFAULT_MIN_VERSION: SecureVersion = js.native
  @scala.inline
  def DEFAULT_MIN_VERSION_=(x: SecureVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MIN_VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * Accepts encrypted connections using TLS or SSL.
    * @since v0.3.2
    */
  @JSImport("node:tls", "Server")
  @js.native
  class Server () extends StObject {
    def this(options: TlsOptions) = this()
    def this(secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, Unit]) = this()
    def this(
      options: TlsOptions,
      secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, Unit]
    ) = this()
  }
  
  /**
    * Performs transparent encryption of written data and all required TLS
    * negotiation.
    *
    * Instances of `tls.TLSSocket` implement the duplex `Stream` interface.
    *
    * Methods that return TLS connection metadata (e.g.{@link TLSSocket.getPeerCertificate} will only return data while the
    * connection is open.
    * @since v0.11.4
    */
  @JSImport("node:tls", "TLSSocket")
  @js.native
  class TLSSocket protected () extends StObject {
    /**
      * Construct a new tls.TLSSocket object from an existing TCP socket.
      */
    def this(socket: Socket) = this()
    def this(socket: Socket, options: TLSSocketOptions) = this()
  }
  
  /**
    * Verifies the certificate `cert` is issued to `hostname`.
    *
    * Returns [Error](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error) object, populating it with `reason`, `host`, and `cert` on
    * failure. On success, returns [undefined](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#Undefined_type).
    *
    * This function can be overwritten by providing alternative function as part of
    * the `options.checkServerIdentity` option passed to `tls.connect()`. The
    * overwriting function can call `tls.checkServerIdentity()` of course, to augment
    * the checks done with additional verification.
    *
    * This function is only called if the certificate passed all other checks, such as
    * being issued by trusted CA (`options.ca`).
    * @since v0.8.4
    * @param hostname The host name or IP address to verify the certificate against.
    * @param cert A `certificate object` representing the peer's certificate.
    */
  @scala.inline
  def checkServerIdentity(hostname: String, cert: PeerCertificate): js.UndefOr[js.Error] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkServerIdentity")(hostname.asInstanceOf[js.Any], cert.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Error]]
  
  /**
    * The `callback` function, if specified, will be added as a listener for the `'secureConnect'` event.
    *
    * `tls.connect()` returns a {@link TLSSocket} object.
    *
    * Unlike the `https` API, `tls.connect()` does not enable the
    * SNI (Server Name Indication) extension by default, which may cause some
    * servers to return an incorrect certificate or reject the connection
    * altogether. To enable SNI, set the `servername` option in addition
    * to `host`.
    *
    * The following illustrates a client for the echo server example from {@link createServer}:
    *
    * ```js
    * // Assumes an echo server that is listening on port 8000.
    * const tls = require('tls');
    * const fs = require('fs');
    *
    * const options = {
    *   // Necessary only if the server requires client certificate authentication.
    *   key: fs.readFileSync('client-key.pem'),
    *   cert: fs.readFileSync('client-cert.pem'),
    *
    *   // Necessary only if the server uses a self-signed certificate.
    *   ca: [ fs.readFileSync('server-cert.pem') ],
    *
    *   // Necessary only if the server's cert isn't for "localhost".
    *   checkServerIdentity: () => { return null; },
    * };
    *
    * const socket = tls.connect(8000, options, () => {
    *   console.log('client connected',
    *               socket.authorized ? 'authorized' : 'unauthorized');
    *   process.stdin.pipe(socket);
    *   process.stdin.resume();
    * });
    * socket.setEncoding('utf8');
    * socket.on('data', (data) => {
    *   console.log(data);
    * });
    * socket.on('end', () => {
    *   console.log('server ends connection');
    * });
    * ```
    * @since v0.11.3
    */
  @scala.inline
  def connect(options: ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double): tmttyped.node.tlsMod.TLSSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: String): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: String, options: Unit, secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: String, options: ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: Unit, options: Unit, secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: Unit, options: ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: Unit, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, options: Unit, secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, options: ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  
  /**
    * {@link createServer} sets the default value of the `honorCipherOrder` option
    * to `true`, other APIs that create secure contexts leave it unset.
    *
    * {@link createServer} uses a 128 bit truncated SHA1 hash value generated
    * from `process.argv` as the default value of the `sessionIdContext` option, other
    * APIs that create secure contexts have no default value.
    *
    * The `tls.createSecureContext()` method creates a `SecureContext` object. It is
    * usable as an argument to several `tls` APIs, such as {@link createServer} and `server.addContext()`, but has no public methods.
    *
    * A key is _required_ for ciphers that use certificates. Either `key` or`pfx` can be used to provide it.
    *
    * If the `ca` option is not given, then Node.js will default to using [Mozilla's publicly trusted list of
    * CAs](https://hg.mozilla.org/mozilla-central/raw-file/tip/security/nss/lib/ckfw/builtins/certdata.txt).
    * @since v0.11.13
    */
  @scala.inline
  def createSecureContext(): SecureContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")().asInstanceOf[SecureContext]
  @scala.inline
  def createSecureContext(options: SecureContextOptions): SecureContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")(options.asInstanceOf[js.Any]).asInstanceOf[SecureContext]
  
  /**
    * Creates a new secure pair object with two streams, one of which reads and writes
    * the encrypted data and the other of which reads and writes the cleartext data.
    * Generally, the encrypted stream is piped to/from an incoming encrypted data
    * stream and the cleartext one is used as a replacement for the initial encrypted
    * stream.
    *
    * `tls.createSecurePair()` returns a `tls.SecurePair` object with `cleartext` and`encrypted` stream properties.
    *
    * Using `cleartext` has the same API as {@link TLSSocket}.
    *
    * The `tls.createSecurePair()` method is now deprecated in favor of`tls.TLSSocket()`. For example, the code:
    *
    * ```js
    * pair = tls.createSecurePair(// ... );
    * pair.encrypted.pipe(socket);
    * socket.pipe(pair.encrypted);
    * ```
    *
    * can be replaced by:
    *
    * ```js
    * secureSocket = tls.TLSSocket(socket, options);
    * ```
    *
    * where `secureSocket` has the same API as `pair.cleartext`.
    * @since v0.3.2
    * @deprecated Since v0.11.3 - Use {@link TLSSocket} instead.
    * @param context A secure context object as returned by `tls.createSecureContext()`
    * @param isServer `true` to specify that this TLS connection should be opened as a server.
    * @param requestCert `true` to specify whether a server should request a certificate from a connecting client. Only applies when `isServer` is `true`.
    * @param rejectUnauthorized If not `false` a server automatically reject clients with invalid certificates. Only applies when `isServer` is `true`.
    */
  @scala.inline
  def createSecurePair(): SecurePair = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")().asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: Unit, isServer: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: Unit, isServer: Boolean, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: Unit, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: Unit, isServer: Boolean, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: Unit, isServer: Unit, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: Unit, isServer: Unit, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: Unit, isServer: Unit, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: SecureContext): SecurePair = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any]).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: SecureContext, isServer: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: SecureContext, isServer: Boolean, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: SecureContext, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: SecureContext, isServer: Boolean, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: SecureContext, isServer: Unit, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: SecureContext, isServer: Unit, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(context: SecureContext, isServer: Unit, requestCert: Unit, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  
  /**
    * Creates a new {@link Server}. The `secureConnectionListener`, if provided, is
    * automatically set as a listener for the `'secureConnection'` event.
    *
    * The `ticketKeys` options is automatically shared between `cluster` module
    * workers.
    *
    * The following illustrates a simple echo server:
    *
    * ```js
    * const tls = require('tls');
    * const fs = require('fs');
    *
    * const options = {
    *   key: fs.readFileSync('server-key.pem'),
    *   cert: fs.readFileSync('server-cert.pem'),
    *
    *   // This is necessary only if using client certificate authentication.
    *   requestCert: true,
    *
    *   // This is necessary only if the client uses a self-signed certificate.
    *   ca: [ fs.readFileSync('client-cert.pem') ]
    * };
    *
    * const server = tls.createServer(options, (socket) => {
    *   console.log('server connected',
    *               socket.authorized ? 'authorized' : 'unauthorized');
    *   socket.write('welcome!\n');
    *   socket.setEncoding('utf8');
    *   socket.pipe(socket);
    * });
    * server.listen(8000, () => {
    *   console.log('server bound');
    * });
    * ```
    *
    * The server can be tested by connecting to it using the example client from {@link connect}.
    * @since v0.3.2
    */
  @scala.inline
  def createServer(): tmttyped.node.tlsMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(options: TlsOptions): tmttyped.node.tlsMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(
    options: TlsOptions,
    secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, Unit]
  ): tmttyped.node.tlsMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], secureConnectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, Unit]): tmttyped.node.tlsMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(secureConnectionListener.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.Server]
  
  /**
    * Returns an array with the names of the supported TLS ciphers. The names are
    * lower-case for historical reasons, but must be uppercased to be used in
    * the `ciphers` option of {@link createSecureContext}.
    *
    * Cipher names that start with `'tls_'` are for TLSv1.3, all the others are for
    * TLSv1.2 and below.
    *
    * ```js
    * console.log(tls.getCiphers()); // ['aes128-gcm-sha256', 'aes128-sha', ...]
    * ```
    * @since v0.10.2
    */
  @scala.inline
  def getCiphers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[String]]
  
  /**
    * An immutable array of strings representing the root certificates (in PEM
    * format) used for verifying peer certificates. This is the default value
    * of the ca option to tls.createSecureContext().
    */
  @JSImport("node:tls", "rootCertificates")
  @js.native
  val rootCertificates: js.Array[String] = js.native
}

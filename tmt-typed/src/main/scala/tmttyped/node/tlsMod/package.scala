package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tlsMod {
  
  @scala.inline
  def CLIENT_RENEG_LIMIT: scala.Double = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CLIENT_RENEG_LIMIT").asInstanceOf[scala.Double]
  
  @scala.inline
  def CLIENT_RENEG_WINDOW: scala.Double = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CLIENT_RENEG_WINDOW").asInstanceOf[scala.Double]
  
  /**
    * The default curve name to use for ECDH key agreement in a tls server.
    * The default value is 'auto'. See tls.createSecureContext() for further
    * information.
    */
  @scala.inline
  def DEFAULT_ECDH_CURVE: java.lang.String = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_ECDH_CURVE").asInstanceOf[java.lang.String]
  @scala.inline
  def DEFAULT_ECDH_CURVE_=(x: java.lang.String): scala.Unit = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ECDH_CURVE")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the maxVersion option of
    * tls.createSecureContext(). It can be assigned any of the supported TLS
    * protocol versions, 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default:
    * 'TLSv1.3', unless changed using CLI options. Using --tls-max-v1.2 sets
    * the default to 'TLSv1.2'. Using --tls-max-v1.3 sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the highest maximum
    * is used.
    */
  @scala.inline
  def DEFAULT_MAX_VERSION: tmttyped.node.tlsMod.SecureVersion = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MAX_VERSION").asInstanceOf[tmttyped.node.tlsMod.SecureVersion]
  @scala.inline
  def DEFAULT_MAX_VERSION_=(x: tmttyped.node.tlsMod.SecureVersion): scala.Unit = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the minVersion option of tls.createSecureContext().
    * It can be assigned any of the supported TLS protocol versions,
    * 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default: 'TLSv1.2', unless
    * changed using CLI options. Using --tls-min-v1.0 sets the default to
    * 'TLSv1'. Using --tls-min-v1.1 sets the default to 'TLSv1.1'. Using
    * --tls-min-v1.3 sets the default to 'TLSv1.3'. If multiple of the options
    * are provided, the lowest minimum is used.
    */
  @scala.inline
  def DEFAULT_MIN_VERSION: tmttyped.node.tlsMod.SecureVersion = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MIN_VERSION").asInstanceOf[tmttyped.node.tlsMod.SecureVersion]
  @scala.inline
  def DEFAULT_MIN_VERSION_=(x: tmttyped.node.tlsMod.SecureVersion): scala.Unit = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MIN_VERSION")(x.asInstanceOf[js.Any])
  
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
  def checkServerIdentity(hostname: java.lang.String, cert: tmttyped.node.tlsMod.PeerCertificate): js.UndefOr[js.Error] = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkServerIdentity")(hostname.asInstanceOf[js.Any], cert.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Error]]
  
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
  def connect(options: tmttyped.node.tlsMod.ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(options: tmttyped.node.tlsMod.ConnectionOptions, secureConnectListener: js.Function0[scala.Unit]): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double): tmttyped.node.tlsMod.TLSSocket = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, host: java.lang.String): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: scala.Unit,
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, host: java.lang.String, options: tmttyped.node.tlsMod.ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: tmttyped.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: scala.Unit,
    options: scala.Unit,
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, host: scala.Unit, options: tmttyped.node.tlsMod.ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: scala.Unit,
    options: tmttyped.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, options: scala.Unit, secureConnectListener: js.Function0[scala.Unit]): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, options: tmttyped.node.tlsMod.ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    options: tmttyped.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  
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
  def createSecureContext(): tmttyped.node.tlsMod.SecureContext = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")().asInstanceOf[tmttyped.node.tlsMod.SecureContext]
  @scala.inline
  def createSecureContext(options: tmttyped.node.tlsMod.SecureContextOptions): tmttyped.node.tlsMod.SecureContext = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.SecureContext]
  
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
  def createSecurePair(): tmttyped.node.tlsMod.SecurePair = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")().asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(context: scala.Unit, isServer: scala.Boolean): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(context: scala.Unit, isServer: scala.Boolean, requestCert: scala.Boolean): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    context: scala.Unit,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    context: scala.Unit,
    isServer: scala.Boolean,
    requestCert: scala.Unit,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(context: scala.Unit, isServer: scala.Unit, requestCert: scala.Boolean): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    context: scala.Unit,
    isServer: scala.Unit,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    context: scala.Unit,
    isServer: scala.Unit,
    requestCert: scala.Unit,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(context: tmttyped.node.tlsMod.SecureContext): tmttyped.node.tlsMod.SecurePair = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(context: tmttyped.node.tlsMod.SecureContext, isServer: scala.Boolean): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(context: tmttyped.node.tlsMod.SecureContext, isServer: scala.Boolean, requestCert: scala.Boolean): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    context: tmttyped.node.tlsMod.SecureContext,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    context: tmttyped.node.tlsMod.SecureContext,
    isServer: scala.Boolean,
    requestCert: scala.Unit,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(context: tmttyped.node.tlsMod.SecureContext, isServer: scala.Unit, requestCert: scala.Boolean): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    context: tmttyped.node.tlsMod.SecureContext,
    isServer: scala.Unit,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    context: tmttyped.node.tlsMod.SecureContext,
    isServer: scala.Unit,
    requestCert: scala.Unit,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(context.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  
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
  def createServer(): tmttyped.node.tlsMod.Server = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(options: tmttyped.node.tlsMod.TlsOptions): tmttyped.node.tlsMod.Server = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(
    options: tmttyped.node.tlsMod.TlsOptions,
    secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, scala.Unit]
  ): tmttyped.node.tlsMod.Server = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], secureConnectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, scala.Unit]): tmttyped.node.tlsMod.Server = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(secureConnectionListener.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.Server]
  
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
  def getCiphers(): js.Array[java.lang.String] = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[java.lang.String]]
  
  /**
    * An immutable array of strings representing the root certificates (in PEM
    * format) used for verifying peer certificates. This is the default value
    * of the ca option to tls.createSecureContext().
    */
  @scala.inline
  def rootCertificates: js.Array[java.lang.String] = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("rootCertificates").asInstanceOf[js.Array[java.lang.String]]
}

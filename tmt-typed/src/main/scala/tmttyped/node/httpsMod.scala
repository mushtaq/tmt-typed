package tmttyped.node

import tmttyped.node.NodeJS.ErrnoException
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.dnsMod.LookupOneOptions
import tmttyped.node.httpMod.ClientRequestArgs
import tmttyped.node.httpMod.HttpBase
import tmttyped.node.httpMod.RequestListener
import tmttyped.node.netMod.LookupFunction
import tmttyped.node.nodeHttpMod.ClientRequest
import tmttyped.node.nodeHttpMod.IncomingMessage
import tmttyped.node.nodeNetMod.Socket
import tmttyped.node.nodeUrlMod.URL
import tmttyped.node.tlsMod.CommonConnectionOptions
import tmttyped.node.tlsMod.PSKCallbackNegotation
import tmttyped.node.tlsMod.PeerCertificate
import tmttyped.node.tlsMod.SecureContextOptions
import tmttyped.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpsMod {
  
  @JSImport("https", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An `Agent` object for HTTPS similar to `http.Agent`. See {@link request} for more information.
    * @since v0.4.5
    */
  @JSImport("https", "Agent")
  @js.native
  class Agent ()
    extends tmttyped.node.nodeHttpMod.Agent {
    def this(options: AgentOptions) = this()
    
    var options: AgentOptions = js.native
  }
  
  /**
    * * Extends: `<tls.Server>`
    *
    * See `http.Server` for more information.
    * @since v0.3.4
    */
  @JSImport("https", "Server")
  @js.native
  class Server ()
    extends StObject
       with HttpBase {
    def this(options: ServerOptions) = this()
    def this(requestListener: RequestListener) = this()
    def this(options: ServerOptions, requestListener: RequestListener) = this()
  }
  
  /**
    * ```js
    * // curl -k https://localhost:8000/
    * const https = require('https');
    * const fs = require('fs');
    *
    * const options = {
    *   key: fs.readFileSync('test/fixtures/keys/agent2-key.pem'),
    *   cert: fs.readFileSync('test/fixtures/keys/agent2-cert.pem')
    * };
    *
    * https.createServer(options, (req, res) => {
    *   res.writeHead(200);
    *   res.end('hello world\n');
    * }).listen(8000);
    * ```
    *
    * Or
    *
    * ```js
    * const https = require('https');
    * const fs = require('fs');
    *
    * const options = {
    *   pfx: fs.readFileSync('test/fixtures/test_cert.pfx'),
    *   passphrase: 'sample'
    * };
    *
    * https.createServer(options, (req, res) => {
    *   res.writeHead(200);
    *   res.end('hello world\n');
    * }).listen(8000);
    * ```
    * @since v0.3.4
    * @param options Accepts `options` from `createServer`, `createSecureContext` and `createServer`.
    * @param requestListener A listener to be added to the `'request'` event.
    */
  @scala.inline
  def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
  @scala.inline
  def createServer(options: ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(options: ServerOptions, requestListener: RequestListener): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], requestListener.asInstanceOf[js.Any])).asInstanceOf[Server]
  @scala.inline
  def createServer(requestListener: RequestListener): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any]).asInstanceOf[Server]
  
  @scala.inline
  def get(options: java.lang.String): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  /**
    * Like `http.get()` but for HTTPS.
    *
    * `options` can be an object, a string, or a `URL` object. If `options` is a
    * string, it is automatically parsed with `new URL()`. If it is a `URL` object, it will be automatically converted to an ordinary `options` object.
    *
    * ```js
    * const https = require('https');
    *
    * https.get('https://encrypted.google.com/', (res) => {
    *   console.log('statusCode:', res.statusCode);
    *   console.log('headers:', res.headers);
    *
    *   res.on('data', (d) => {
    *     process.stdout.write(d);
    *   });
    *
    * }).on('error', (e) => {
    *   console.error(e);
    * });
    * ```
    * @since v0.3.6
    * @param options Accepts the same `options` as {@link request}, with the `method` always set to `GET`.
    */
  @scala.inline
  def get(options: RequestOptions): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: URL): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def get(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(url: java.lang.String, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(url: URL, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def get(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  
  @JSImport("https", "globalAgent")
  @js.native
  def globalAgent: Agent = js.native
  @scala.inline
  def globalAgent_=(x: Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def request(options: java.lang.String): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  /**
    * Makes a request to a secure web server.
    *
    * The following additional `options` from `tls.connect()` are also accepted:`ca`, `cert`, `ciphers`, `clientCertEngine`, `crl`, `dhparam`, `ecdhCurve`,`honorCipherOrder`, `key`, `passphrase`,
    * `pfx`, `rejectUnauthorized`,`secureOptions`, `secureProtocol`, `servername`, `sessionIdContext`,`highWaterMark`.
    *
    * `options` can be an object, a string, or a `URL` object. If `options` is a
    * string, it is automatically parsed with `new URL()`. If it is a `URL` object, it will be automatically converted to an ordinary `options` object.
    *
    * `https.request()` returns an instance of the `http.ClientRequest` class. The `ClientRequest` instance is a writable stream. If one needs to
    * upload a file with a POST request, then write to the `ClientRequest` object.
    *
    * ```js
    * const https = require('https');
    *
    * const options = {
    *   hostname: 'encrypted.google.com',
    *   port: 443,
    *   path: '/',
    *   method: 'GET'
    * };
    *
    * const req = https.request(options, (res) => {
    *   console.log('statusCode:', res.statusCode);
    *   console.log('headers:', res.headers);
    *
    *   res.on('data', (d) => {
    *     process.stdout.write(d);
    *   });
    * });
    *
    * req.on('error', (e) => {
    *   console.error(e);
    * });
    * req.end();
    * ```
    *
    * Example using options from `tls.connect()`:
    *
    * ```js
    * const options = {
    *   hostname: 'encrypted.google.com',
    *   port: 443,
    *   path: '/',
    *   method: 'GET',
    *   key: fs.readFileSync('test/fixtures/keys/agent2-key.pem'),
    *   cert: fs.readFileSync('test/fixtures/keys/agent2-cert.pem')
    * };
    * options.agent = new https.Agent(options);
    *
    * const req = https.request(options, (res) => {
    *   // ...
    * });
    * ```
    *
    * Alternatively, opt out of connection pooling by not using an `Agent`.
    *
    * ```js
    * const options = {
    *   hostname: 'encrypted.google.com',
    *   port: 443,
    *   path: '/',
    *   method: 'GET',
    *   key: fs.readFileSync('test/fixtures/keys/agent2-key.pem'),
    *   cert: fs.readFileSync('test/fixtures/keys/agent2-cert.pem'),
    *   agent: false
    * };
    *
    * const req = https.request(options, (res) => {
    *   // ...
    * });
    * ```
    *
    * Example using a `URL` as `options`:
    *
    * ```js
    * const options = new URL('https://abc:xyz@example.com');
    *
    * const req = https.request(options, (res) => {
    *   // ...
    * });
    * ```
    *
    * Example pinning on certificate fingerprint, or the public key (similar to`pin-sha256`):
    *
    * ```js
    * const tls = require('tls');
    * const https = require('https');
    * const crypto = require('crypto');
    *
    * function sha256(s) {
    *   return crypto.createHash('sha256').update(s).digest('base64');
    * }
    * const options = {
    *   hostname: 'github.com',
    *   port: 443,
    *   path: '/',
    *   method: 'GET',
    *   checkServerIdentity: function(host, cert) {
    *     // Make sure the certificate is issued to the host we are connected to
    *     const err = tls.checkServerIdentity(host, cert);
    *     if (err) {
    *       return err;
    *     }
    *
    *     // Pin the public key, similar to HPKP pin-sha25 pinning
    *     const pubkey256 = 'pL1+qb9HTMRZJmuC/bB/ZI9d302BYrrqiVuRyW+DGrU=';
    *     if (sha256(cert.pubkey) !== pubkey256) {
    *       const msg = 'Certificate verification error: ' +
    *         `The public key of '${cert.subject.CN}' ` +
    *         'does not match our pinned fingerprint';
    *       return new Error(msg);
    *     }
    *
    *     // Pin the exact certificate, rather than the pub key
    *     const cert256 = '25:FE:39:32:D9:63:8C:8A:FC:A1:9A:29:87:' +
    *       'D8:3E:4C:1D:98:DB:71:E4:1A:48:03:98:EA:22:6A:BD:8B:93:16';
    *     if (cert.fingerprint256 !== cert256) {
    *       const msg = 'Certificate verification error: ' +
    *         `The certificate of '${cert.subject.CN}' ` +
    *         'does not match our pinned fingerprint';
    *       return new Error(msg);
    *     }
    *
    *     // This loop is informational only.
    *     // Print the certificate and public key fingerprints of all certs in the
    *     // chain. Its common to pin the public key of the issuer on the public
    *     // internet, while pinning the public key of the service in sensitive
    *     // environments.
    *     do {
    *       console.log('Subject Common Name:', cert.subject.CN);
    *       console.log('  Certificate SHA256 fingerprint:', cert.fingerprint256);
    *
    *       hash = crypto.createHash('sha256');
    *       console.log('  Public key ping-sha256:', sha256(cert.pubkey));
    *
    *       lastprint256 = cert.fingerprint256;
    *       cert = cert.issuerCertificate;
    *     } while (cert.fingerprint256 !== lastprint256);
    *
    *   },
    * };
    *
    * options.agent = new https.Agent(options);
    * const req = https.request(options, (res) => {
    *   console.log('All OK. Server matched our pinned cert or public key');
    *   console.log('statusCode:', res.statusCode);
    *   // Print the HPKP values
    *   console.log('headers:', res.headers['public-key-pins']);
    *
    *   res.on('data', (d) => {});
    * });
    *
    * req.on('error', (e) => {
    *   console.error(e.message);
    * });
    * req.end();
    * ```
    *
    * Outputs for example:
    *
    * ```text
    * Subject Common Name: github.com
    *   Certificate SHA256 fingerprint: 25:FE:39:32:D9:63:8C:8A:FC:A1:9A:29:87:D8:3E:4C:1D:98:DB:71:E4:1A:48:03:98:EA:22:6A:BD:8B:93:16
    *   Public key ping-sha256: pL1+qb9HTMRZJmuC/bB/ZI9d302BYrrqiVuRyW+DGrU=
    * Subject Common Name: DigiCert SHA2 Extended Validation Server CA
    *   Certificate SHA256 fingerprint: 40:3E:06:2A:26:53:05:91:13:28:5B:AF:80:A0:D4:AE:42:2C:84:8C:9F:78:FA:D0:1F:C9:4B:C5:B8:7F:EF:1A
    *   Public key ping-sha256: RRM1dGqnDFsCJXBTHky16vi1obOlCgFFn/yOhI/y+ho=
    * Subject Common Name: DigiCert High Assurance EV Root CA
    *   Certificate SHA256 fingerprint: 74:31:E5:F4:C3:C1:CE:46:90:77:4F:0B:61:E0:54:40:88:3B:A9:A0:1E:D0:0B:A6:AB:D7:80:6E:D3:B1:18:CF
    *   Public key ping-sha256: WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=
    * All OK. Server matched our pinned cert or public key
    * statusCode: 200
    * headers: max-age=0; pin-sha256="WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18="; pin-sha256="RRM1dGqnDFsCJXBTHky16vi1obOlCgFFn/yOhI/y+ho=";
    * pin-sha256="k2v657xBsOVe1PQRwOsHsw3bsGT2VzIqz5K+59sNQws="; pin-sha256="K87oWBWM9UZfyddvDfoxL+8lpNyoUB2ptGtn0fv6G2Q="; pin-sha256="IQBnNBEiFuhj+8x6X8XLgh01V9Ic5/V3IRQLNFFc7v4=";
    * pin-sha256="iie1VXtL7HzAMF+/PVPR9xzT80kQxdZeJ+zduCB3uj0="; pin-sha256="LvRiGEjRqfzurezaWuj8Wie2gyHMrW5Q06LspMnox7A="; includeSubDomains
    * ```
    * @since v0.3.6
    * @param options Accepts all `options` from `request`, with some differences in default values:
    */
  @scala.inline
  def request(options: RequestOptions): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: URL): ClientRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[ClientRequest]
  @scala.inline
  def request(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: java.lang.String, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: URL, options: RequestOptions): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  @scala.inline
  def request(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ClientRequest]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - tmttyped.node.tlsMod.ConnectionOptions because var conflicts: timeout. Inlined host, port, path, socket, checkServerIdentity, servername, session, minDHSize, lookup, pskCallback */ trait AgentOptions
    extends StObject
       with tmttyped.node.httpMod.AgentOptions
       with SecureContextOptions
       with CommonConnectionOptions {
    
    // Establish secure connection on a given socket rather than creating a new socket
    var checkServerIdentity: js.UndefOr[
        js.Function2[/* host */ java.lang.String, /* cert */ PeerCertificate, js.UndefOr[js.Error]]
      ] = js.undefined
    
    var host: js.UndefOr[java.lang.String] = js.undefined
    
    var lookup: js.UndefOr[LookupFunction] = js.undefined
    
    var maxCachedSessions: js.UndefOr[Double] = js.undefined
    
    var minDHSize: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[java.lang.String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * When negotiating TLS-PSK (pre-shared keys), this function is called
      * with optional identity `hint` provided by the server or `null`
      * in case of TLS 1.3 where `hint` was removed.
      * It will be necessary to provide a custom `tls.checkServerIdentity()`
      * for the connection as the default one will try to check hostname/IP
      * of the server against the certificate but that's not applicable for PSK
      * because there won't be a certificate present.
      * More information can be found in the RFC 4279.
      *
      * @param hint message sent from the server to help client
      * decide which identity to use during negotiation.
      * Always `null` if TLS 1.3 is used.
      * @returns Return `null` to stop the negotiation process. `psk` must be
      * compatible with the selected cipher's digest.
      * `identity` must use UTF-8 encoding.
      */
    var pskCallback: js.UndefOr[js.Function1[/* hint */ java.lang.String | Null, PSKCallbackNegotation | Null]] = js.undefined
    
    var servername: js.UndefOr[java.lang.String] = js.undefined
    
    // SNI TLS Extension
    var session: js.UndefOr[Buffer] = js.undefined
    
    // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
    var socket: js.UndefOr[Socket] = js.undefined
  }
  object AgentOptions {
    
    @scala.inline
    def apply(): AgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentOptions]
    }
    
    @scala.inline
    implicit class AgentOptionsMutableBuilder[Self <: AgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckServerIdentity(value: (/* host */ java.lang.String, /* cert */ PeerCertificate) => js.UndefOr[js.Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLookup(
        value: (/* hostname */ java.lang.String, /* options */ LookupOneOptions, /* callback */ js.Function3[
              /* err */ ErrnoException | Null, 
              /* address */ java.lang.String, 
              /* family */ Double, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      @scala.inline
      def setMaxCachedSessions(value: Double): Self = StObject.set(x, "maxCachedSessions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCachedSessionsUndefined: Self = StObject.set(x, "maxCachedSessions", js.undefined)
      
      @scala.inline
      def setMinDHSize(value: Double): Self = StObject.set(x, "minDHSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDHSizeUndefined: Self = StObject.set(x, "minDHSize", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPskCallback(value: /* hint */ java.lang.String | Null => PSKCallbackNegotation | Null): Self = StObject.set(x, "pskCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPskCallbackUndefined: Self = StObject.set(x, "pskCallback", js.undefined)
      
      @scala.inline
      def setServername(value: java.lang.String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSession(value: Buffer): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  trait RequestOptions
    extends StObject
       with ClientRequestArgs
       with SecureContextOptions {
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    // Defaults to true
    var servername: js.UndefOr[java.lang.String] = js.undefined
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setServername(value: java.lang.String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    }
  }
  
  trait ServerOptions
    extends StObject
       with TlsOptions
       with tmttyped.node.httpMod.ServerOptions
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
  }
}

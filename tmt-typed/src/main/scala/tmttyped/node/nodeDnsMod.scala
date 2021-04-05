package tmttyped.node

import tmttyped.node.NodeJS.ErrnoException
import tmttyped.node.anon.Hostname
import tmttyped.node.dnsMod.AnyRecord
import tmttyped.node.dnsMod.LookupAddress
import tmttyped.node.dnsMod.LookupAllOptions
import tmttyped.node.dnsMod.LookupOneOptions
import tmttyped.node.dnsMod.LookupOptions
import tmttyped.node.dnsMod.MxRecord
import tmttyped.node.dnsMod.NaptrRecord
import tmttyped.node.dnsMod.RecordWithTtl
import tmttyped.node.dnsMod.ResolveOptions
import tmttyped.node.dnsMod.ResolveWithTtlOptions
import tmttyped.node.dnsMod.ResolverOptions
import tmttyped.node.dnsMod.SoaRecord
import tmttyped.node.dnsMod.SrvRecord
import tmttyped.node.nodeStrings.A
import tmttyped.node.nodeStrings.AAAA
import tmttyped.node.nodeStrings.ANY
import tmttyped.node.nodeStrings.CNAME
import tmttyped.node.nodeStrings.MX
import tmttyped.node.nodeStrings.NAPTR
import tmttyped.node.nodeStrings.NS
import tmttyped.node.nodeStrings.PTR
import tmttyped.node.nodeStrings.SOA
import tmttyped.node.nodeStrings.SRV
import tmttyped.node.nodeStrings.TXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeDnsMod {
  
  @JSImport("node:dns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Supported getaddrinfo flags.
  @JSImport("node:dns", "ADDRCONFIG")
  @js.native
  val ADDRCONFIG: Double = js.native
  
  @JSImport("node:dns", "ADDRGETNETWORKPARAMS")
  @js.native
  val ADDRGETNETWORKPARAMS: java.lang.String = js.native
  
  /**
    * If `dns.V4MAPPED` is specified, return resolved IPv6 addresses as
    * well as IPv4 mapped IPv6 addresses.
    */
  @JSImport("node:dns", "ALL")
  @js.native
  val ALL: Double = js.native
  
  @JSImport("node:dns", "BADFAMILY")
  @js.native
  val BADFAMILY: java.lang.String = js.native
  
  @JSImport("node:dns", "BADFLAGS")
  @js.native
  val BADFLAGS: java.lang.String = js.native
  
  @JSImport("node:dns", "BADHINTS")
  @js.native
  val BADHINTS: java.lang.String = js.native
  
  @JSImport("node:dns", "BADNAME")
  @js.native
  val BADNAME: java.lang.String = js.native
  
  @JSImport("node:dns", "BADQUERY")
  @js.native
  val BADQUERY: java.lang.String = js.native
  
  @JSImport("node:dns", "BADRESP")
  @js.native
  val BADRESP: java.lang.String = js.native
  
  @JSImport("node:dns", "BADSTR")
  @js.native
  val BADSTR: java.lang.String = js.native
  
  @JSImport("node:dns", "CANCELLED")
  @js.native
  val CANCELLED: java.lang.String = js.native
  
  @JSImport("node:dns", "CONNREFUSED")
  @js.native
  val CONNREFUSED: java.lang.String = js.native
  
  @JSImport("node:dns", "DESTRUCTION")
  @js.native
  val DESTRUCTION: java.lang.String = js.native
  
  @JSImport("node:dns", "EOF")
  @js.native
  val EOF: java.lang.String = js.native
  
  @JSImport("node:dns", "FILE")
  @js.native
  val FILE: java.lang.String = js.native
  
  @JSImport("node:dns", "FORMERR")
  @js.native
  val FORMERR: java.lang.String = js.native
  
  @JSImport("node:dns", "LOADIPHLPAPI")
  @js.native
  val LOADIPHLPAPI: java.lang.String = js.native
  
  // Error codes
  @JSImport("node:dns", "NODATA")
  @js.native
  val NODATA: java.lang.String = js.native
  
  @JSImport("node:dns", "NOMEM")
  @js.native
  val NOMEM: java.lang.String = js.native
  
  @JSImport("node:dns", "NONAME")
  @js.native
  val NONAME: java.lang.String = js.native
  
  @JSImport("node:dns", "NOTFOUND")
  @js.native
  val NOTFOUND: java.lang.String = js.native
  
  @JSImport("node:dns", "NOTIMP")
  @js.native
  val NOTIMP: java.lang.String = js.native
  
  @JSImport("node:dns", "NOTINITIALIZED")
  @js.native
  val NOTINITIALIZED: java.lang.String = js.native
  
  @JSImport("node:dns", "REFUSED")
  @js.native
  val REFUSED: java.lang.String = js.native
  
  @JSImport("node:dns", "Resolver")
  @js.native
  class Resolver ()
    extends tmttyped.node.dnsMod.Resolver {
    def this(options: ResolverOptions) = this()
  }
  
  @JSImport("node:dns", "SERVFAIL")
  @js.native
  val SERVFAIL: java.lang.String = js.native
  
  @JSImport("node:dns", "TIMEOUT")
  @js.native
  val TIMEOUT: java.lang.String = js.native
  
  @JSImport("node:dns", "V4MAPPED")
  @js.native
  val V4MAPPED: Double = js.native
  
  @scala.inline
  def getServers(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServers")().asInstanceOf[js.Array[java.lang.String]]
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def lookup(
    hostname: java.lang.String,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def lookup(
    hostname: java.lang.String,
    family: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], family.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def lookup(
    hostname: java.lang.String,
    options: LookupAllOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def lookup(
    hostname: java.lang.String,
    options: LookupOneOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def lookup(
    hostname: java.lang.String,
    options: LookupOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String | js.Array[LookupAddress], 
      /* family */ Double, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def lookupService(
    address: java.lang.String,
    port: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* hostname */ java.lang.String, 
      /* service */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object promises {
    
    @JSImport("node:dns", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node:dns", "promises.Resolver")
    @js.native
    class Resolver ()
      extends tmttyped.node.dnsMod.promises.Resolver {
      def this(options: ResolverOptions) = this()
    }
    
    @scala.inline
    def getServers(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServers")().asInstanceOf[js.Array[java.lang.String]]
    
    @scala.inline
    def lookup(hostname: java.lang.String): js.Promise[LookupAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LookupAddress]]
    @scala.inline
    def lookup(hostname: java.lang.String, family: Double): js.Promise[LookupAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress]]
    @scala.inline
    def lookup(hostname: java.lang.String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[LookupAddress]]]
    @scala.inline
    def lookup(hostname: java.lang.String, options: LookupOneOptions): js.Promise[LookupAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress]]
    @scala.inline
    def lookup(hostname: java.lang.String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress | js.Array[LookupAddress]]]
    
    @scala.inline
    def lookupService(address: java.lang.String, port: Double): js.Promise[Hostname] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(address.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hostname]]
    
    @scala.inline
    def resolve(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    @scala.inline
    def resolve(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
        (js.Array[
          AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
        ]) | SoaRecord
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        (js.Array[
          AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
        ]) | SoaRecord
      ]]
    
    @scala.inline
    def resolve4(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    @scala.inline
    def resolve4(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | java.lang.String]]]
    @scala.inline
    def resolve4(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
    
    @scala.inline
    def resolve6(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    @scala.inline
    def resolve6(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | java.lang.String]]]
    @scala.inline
    def resolve6(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
    
    @scala.inline
    def resolveAny(hostname: java.lang.String): js.Promise[js.Array[AnyRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAny")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
    
    @scala.inline
    def resolveCname(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    
    @scala.inline
    def resolveMx(hostname: java.lang.String): js.Promise[js.Array[MxRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MxRecord]]]
    
    @scala.inline
    def resolveNaptr(hostname: java.lang.String): js.Promise[js.Array[NaptrRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNaptr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
    
    @scala.inline
    def resolveNs(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    
    @scala.inline
    def resolvePtr(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePtr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    
    @scala.inline
    def resolveSoa(hostname: java.lang.String): js.Promise[SoaRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSoa")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SoaRecord]]
    
    @scala.inline
    def resolveSrv(hostname: java.lang.String): js.Promise[js.Array[SrvRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
    
    @scala.inline
    def resolveTxt(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Array[java.lang.String]]]]
    
    @scala.inline
    def resolve_A(hostname: java.lang.String, rrtype: A): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    
    @scala.inline
    def resolve_AAAA(hostname: java.lang.String, rrtype: AAAA): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    
    @scala.inline
    def resolve_ANY(hostname: java.lang.String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
    
    @scala.inline
    def resolve_CNAME(hostname: java.lang.String, rrtype: CNAME): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    
    @scala.inline
    def resolve_MX(hostname: java.lang.String, rrtype: MX): js.Promise[js.Array[MxRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MxRecord]]]
    
    @scala.inline
    def resolve_NAPTR(hostname: java.lang.String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
    
    @scala.inline
    def resolve_NS(hostname: java.lang.String, rrtype: NS): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    
    @scala.inline
    def resolve_PTR(hostname: java.lang.String, rrtype: PTR): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    
    @scala.inline
    def resolve_SOA(hostname: java.lang.String, rrtype: SOA): js.Promise[SoaRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SoaRecord]]
    
    @scala.inline
    def resolve_SRV(hostname: java.lang.String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
    
    @scala.inline
    def resolve_TXT(hostname: java.lang.String, rrtype: TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Array[java.lang.String]]]]
    
    @scala.inline
    def reverse(ip: java.lang.String): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
    
    @scala.inline
    def setServers(servers: js.Array[java.lang.String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setServers")(servers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: java.lang.String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ (js.Array[
        AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
      ]) | SoaRecord, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: AAAA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: ANY,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: A,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: CNAME,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: MX,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: NAPTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: NS,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: PTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: SOA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: SRV,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve(
    hostname: java.lang.String,
    rrtype: TXT,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve4(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve4(
    hostname: java.lang.String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | java.lang.String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve4(
    hostname: java.lang.String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve6(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve6(
    hostname: java.lang.String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | java.lang.String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @scala.inline
  def resolve6(
    hostname: java.lang.String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveAny(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAny")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveCname(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveMx(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveNaptr(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNaptr")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveNs(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolvePtr(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePtr")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveSoa(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSoa")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveSrv(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveTxt(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def reverse(
    ip: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setServers(servers: js.Array[java.lang.String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setServers")(servers.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

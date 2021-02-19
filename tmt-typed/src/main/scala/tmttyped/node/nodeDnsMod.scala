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
  
  @JSImport("node:dns", "getServers")
  @js.native
  def getServers(): js.Array[java.lang.String] = js.native
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "lookup")
  @js.native
  def lookup(
    hostname: java.lang.String,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "lookup")
  @js.native
  def lookup(
    hostname: java.lang.String,
    family: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "lookup")
  @js.native
  def lookup(
    hostname: java.lang.String,
    options: LookupAllOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "lookup")
  @js.native
  def lookup(
    hostname: java.lang.String,
    options: LookupOneOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "lookup")
  @js.native
  def lookup(
    hostname: java.lang.String,
    options: LookupOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String | js.Array[LookupAddress], 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("node:dns", "lookupService")
  @js.native
  def lookupService(
    address: java.lang.String,
    port: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* hostname */ java.lang.String, 
      /* service */ java.lang.String, 
      Unit
    ]
  ): Unit = js.native
  
  object promises {
    
    @JSImport("node:dns", "promises.Resolver")
    @js.native
    class Resolver ()
      extends tmttyped.node.dnsMod.promises.Resolver {
      def this(options: ResolverOptions) = this()
    }
    
    @JSImport("node:dns", "promises.getServers")
    @js.native
    def getServers(): js.Array[java.lang.String] = js.native
    
    @JSImport("node:dns", "promises.lookup")
    @js.native
    def lookup(hostname: java.lang.String): js.Promise[LookupAddress] = js.native
    @JSImport("node:dns", "promises.lookup")
    @js.native
    def lookup(hostname: java.lang.String, family: Double): js.Promise[LookupAddress] = js.native
    @JSImport("node:dns", "promises.lookup")
    @js.native
    def lookup(hostname: java.lang.String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
    @JSImport("node:dns", "promises.lookup")
    @js.native
    def lookup(hostname: java.lang.String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
    @JSImport("node:dns", "promises.lookup")
    @js.native
    def lookup(hostname: java.lang.String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
    
    @JSImport("node:dns", "promises.lookupService")
    @js.native
    def lookupService(address: java.lang.String, port: Double): js.Promise[Hostname] = js.native
    
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
        (js.Array[
          AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
        ]) | SoaRecord
      ] = js.native
    
    @JSImport("node:dns", "promises.resolve4")
    @js.native
    def resolve4(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve4")
    @js.native
    def resolve4(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve4")
    @js.native
    def resolve4(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    
    @JSImport("node:dns", "promises.resolve6")
    @js.native
    def resolve6(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve6")
    @js.native
    def resolve6(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve6")
    @js.native
    def resolve6(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    
    @JSImport("node:dns", "promises.resolveAny")
    @js.native
    def resolveAny(hostname: java.lang.String): js.Promise[js.Array[AnyRecord]] = js.native
    
    @JSImport("node:dns", "promises.resolveCname")
    @js.native
    def resolveCname(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    
    @JSImport("node:dns", "promises.resolveMx")
    @js.native
    def resolveMx(hostname: java.lang.String): js.Promise[js.Array[MxRecord]] = js.native
    
    @JSImport("node:dns", "promises.resolveNaptr")
    @js.native
    def resolveNaptr(hostname: java.lang.String): js.Promise[js.Array[NaptrRecord]] = js.native
    
    @JSImport("node:dns", "promises.resolveNs")
    @js.native
    def resolveNs(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    
    @JSImport("node:dns", "promises.resolvePtr")
    @js.native
    def resolvePtr(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    
    @JSImport("node:dns", "promises.resolveSoa")
    @js.native
    def resolveSoa(hostname: java.lang.String): js.Promise[SoaRecord] = js.native
    
    @JSImport("node:dns", "promises.resolveSrv")
    @js.native
    def resolveSrv(hostname: java.lang.String): js.Promise[js.Array[SrvRecord]] = js.native
    
    @JSImport("node:dns", "promises.resolveTxt")
    @js.native
    def resolveTxt(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
    
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_A(hostname: java.lang.String, rrtype: A): js.Promise[js.Array[java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_AAAA(hostname: java.lang.String, rrtype: AAAA): js.Promise[js.Array[java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_ANY(hostname: java.lang.String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_CNAME(hostname: java.lang.String, rrtype: CNAME): js.Promise[js.Array[java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_MX(hostname: java.lang.String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_NAPTR(hostname: java.lang.String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_NS(hostname: java.lang.String, rrtype: NS): js.Promise[js.Array[java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_PTR(hostname: java.lang.String, rrtype: PTR): js.Promise[js.Array[java.lang.String]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_SOA(hostname: java.lang.String, rrtype: SOA): js.Promise[SoaRecord] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_SRV(hostname: java.lang.String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
    @JSImport("node:dns", "promises.resolve")
    @js.native
    def resolve_TXT(hostname: java.lang.String, rrtype: TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
    
    @JSImport("node:dns", "promises.reverse")
    @js.native
    def reverse(ip: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    
    @JSImport("node:dns", "promises.setServers")
    @js.native
    def setServers(servers: js.Array[java.lang.String]): Unit = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
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
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: AAAA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: ANY,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: A,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: CNAME,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: MX,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: NAPTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: NS,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: PTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: SOA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: SRV,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve")
  @js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: TXT,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      Unit
    ]
  ): Unit = js.native
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve4")
  @js.native
  def resolve4(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve4")
  @js.native
  def resolve4(
    hostname: java.lang.String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | java.lang.String], 
      Unit
    ]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve4")
  @js.native
  def resolve4(
    hostname: java.lang.String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve6")
  @js.native
  def resolve6(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve6")
  @js.native
  def resolve6(
    hostname: java.lang.String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | java.lang.String], 
      Unit
    ]
  ): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @JSImport("node:dns", "resolve6")
  @js.native
  def resolve6(
    hostname: java.lang.String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "resolveAny")
  @js.native
  def resolveAny(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "resolveCname")
  @js.native
  def resolveCname(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "resolveMx")
  @js.native
  def resolveMx(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "resolveNaptr")
  @js.native
  def resolveNaptr(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "resolveNs")
  @js.native
  def resolveNs(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "resolvePtr")
  @js.native
  def resolvePtr(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "resolveSoa")
  @js.native
  def resolveSoa(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "resolveSrv")
  @js.native
  def resolveSrv(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "resolveTxt")
  @js.native
  def resolveTxt(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("node:dns", "reverse")
  @js.native
  def reverse(
    ip: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  
  @JSImport("node:dns", "setServers")
  @js.native
  def setServers(servers: js.Array[java.lang.String]): Unit = js.native
}

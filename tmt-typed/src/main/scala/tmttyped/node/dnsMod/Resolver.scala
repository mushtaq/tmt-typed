package tmttyped.node.dnsMod

import tmttyped.node.NodeJS.ErrnoException
import tmttyped.node.anon.Typeofresolve
import tmttyped.node.anon.Typeofresolve4
import tmttyped.node.anon.Typeofresolve6
import tmttyped.node.anon.TypeofresolveAny
import tmttyped.node.anon.TypeofresolveCname
import tmttyped.node.anon.TypeofresolveMx
import tmttyped.node.anon.TypeofresolveNaptr
import tmttyped.node.anon.TypeofresolveNs
import tmttyped.node.anon.TypeofresolvePtr
import tmttyped.node.anon.TypeofresolveSoa
import tmttyped.node.anon.TypeofresolveSrv
import tmttyped.node.anon.TypeofresolveTxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dns", "Resolver")
@js.native
class Resolver () extends StObject {
  def this(options: ResolverOptions) = this()
  
  def cancel(): Unit = js.native
  
  def getServers(): js.Array[String] = js.native
  @JSName("getServers")
  var getServers_Original: js.Function0[js.Array[String]] = js.native
  
  var resolve: Typeofresolve = js.native
  
  var resolve4: Typeofresolve4 = js.native
  
  var resolve6: Typeofresolve6 = js.native
  
  var resolveAny: TypeofresolveAny = js.native
  
  var resolveCname: TypeofresolveCname = js.native
  
  var resolveMx: TypeofresolveMx = js.native
  
  var resolveNaptr: TypeofresolveNaptr = js.native
  
  var resolveNs: TypeofresolveNs = js.native
  
  var resolvePtr: TypeofresolvePtr = js.native
  
  var resolveSoa: TypeofresolveSoa = js.native
  
  var resolveSrv: TypeofresolveSrv = js.native
  
  var resolveTxt: TypeofresolveTxt = js.native
  
  def reverse(
    ip: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("reverse")
  var reverse_Original: js.Function2[
    /* ip */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit], 
    Unit
  ] = js.native
  
  def setLocalAddress(): Unit = js.native
  def setLocalAddress(ipv4: js.UndefOr[scala.Nothing], ipv6: String): Unit = js.native
  def setLocalAddress(ipv4: String): Unit = js.native
  def setLocalAddress(ipv4: String, ipv6: String): Unit = js.native
  
  def setServers(servers: js.Array[String]): Unit = js.native
  @JSName("setServers")
  var setServers_Original: js.Function1[/* servers */ js.Array[String], Unit] = js.native
}

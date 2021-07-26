package tmttyped.node.anon

import tmttyped.node.dnsMod.AnyRecord
import tmttyped.node.dnsMod.CaaRecord
import tmttyped.node.dnsMod.MxRecord
import tmttyped.node.dnsMod.NaptrRecord
import tmttyped.node.dnsMod.SoaRecord
import tmttyped.node.dnsMod.SrvRecord
import tmttyped.node.nodeStrings.A
import tmttyped.node.nodeStrings.AAAA
import tmttyped.node.nodeStrings.ANY
import tmttyped.node.nodeStrings.CAA
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

@js.native
trait FnCallHostnameRrtype extends StObject {
  
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  def apply(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  def apply(hostname: String, rrtype: CAA): js.Promise[js.Array[CaaRecord]] = js.native
  def apply(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  def apply(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  def apply(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  def apply(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  def apply(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
}

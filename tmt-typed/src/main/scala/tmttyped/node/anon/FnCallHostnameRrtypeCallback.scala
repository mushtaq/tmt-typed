package tmttyped.node.anon

import tmttyped.node.dnsMod.AnyRecord
import tmttyped.node.dnsMod.MxRecord
import tmttyped.node.dnsMod.NaptrRecord
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostnameRrtypeCallback extends StObject {
  
  def apply(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: AAAA,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: ANY,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[AnyRecord], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: A,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: CNAME,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: MX,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[MxRecord], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: NAPTR,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[NaptrRecord], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: NS,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: PTR,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: SOA,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ SoaRecord, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: SRV,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[SrvRecord], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: TXT,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[js.Array[String]], 
      Unit
    ]
  ): Unit = js.native
}

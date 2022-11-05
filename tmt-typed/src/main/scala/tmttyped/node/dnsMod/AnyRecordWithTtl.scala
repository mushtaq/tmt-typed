package tmttyped.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.node.dnsMod.AnyARecord
  - tmttyped.node.dnsMod.AnyAaaaRecord
*/
trait AnyRecordWithTtl extends StObject
object AnyRecordWithTtl {
  
  inline def AnyARecord(address: String, ttl: Double): tmttyped.node.dnsMod.AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("A")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyARecord]
  }
  
  inline def AnyAaaaRecord(address: String, ttl: Double): tmttyped.node.dnsMod.AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AAAA")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyAaaaRecord]
  }
}

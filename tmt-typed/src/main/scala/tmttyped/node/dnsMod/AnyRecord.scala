package tmttyped.node.dnsMod

import tmttyped.node.nodeStrings.A
import tmttyped.node.nodeStrings.AAAA
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

/* Rewritten from type alias, can be one of: 
  - tmttyped.node.dnsMod.AnyARecord
  - tmttyped.node.dnsMod.AnyAaaaRecord
  - tmttyped.node.dnsMod.AnyCnameRecord
  - tmttyped.node.dnsMod.AnyMxRecord
  - tmttyped.node.dnsMod.AnyNaptrRecord
  - tmttyped.node.dnsMod.AnyNsRecord
  - tmttyped.node.dnsMod.AnyPtrRecord
  - tmttyped.node.dnsMod.AnySoaRecord
  - tmttyped.node.dnsMod.AnySrvRecord
  - tmttyped.node.dnsMod.AnyTxtRecord
*/
trait AnyRecord extends StObject
object AnyRecord {
  
  @scala.inline
  def AnyARecord(address: String, ttl: Double, `type`: A): tmttyped.node.dnsMod.AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyARecord]
  }
  
  @scala.inline
  def AnyAaaaRecord(address: String, ttl: Double, `type`: AAAA): tmttyped.node.dnsMod.AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyAaaaRecord]
  }
  
  @scala.inline
  def AnyCnameRecord(`type`: CNAME, value: String): tmttyped.node.dnsMod.AnyCnameRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyCnameRecord]
  }
  
  @scala.inline
  def AnyMxRecord(exchange: String, priority: Double, `type`: MX): tmttyped.node.dnsMod.AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyMxRecord]
  }
  
  @scala.inline
  def AnyNaptrRecord(
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String,
    `type`: NAPTR
  ): tmttyped.node.dnsMod.AnyNaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyNaptrRecord]
  }
  
  @scala.inline
  def AnyNsRecord(`type`: NS, value: String): tmttyped.node.dnsMod.AnyNsRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyNsRecord]
  }
  
  @scala.inline
  def AnyPtrRecord(`type`: PTR, value: String): tmttyped.node.dnsMod.AnyPtrRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyPtrRecord]
  }
  
  @scala.inline
  def AnySoaRecord(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double,
    `type`: SOA
  ): tmttyped.node.dnsMod.AnySoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnySoaRecord]
  }
  
  @scala.inline
  def AnySrvRecord(name: String, port: Double, priority: Double, `type`: SRV, weight: Double): tmttyped.node.dnsMod.AnySrvRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnySrvRecord]
  }
  
  @scala.inline
  def AnyTxtRecord(entries: js.Array[String], `type`: TXT): tmttyped.node.dnsMod.AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyTxtRecord]
  }
}

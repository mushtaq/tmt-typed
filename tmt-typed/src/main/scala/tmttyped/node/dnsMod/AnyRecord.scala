package tmttyped.node.dnsMod

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
  def AnyARecord(address: String, ttl: Double): tmttyped.node.dnsMod.AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("A")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyARecord]
  }
  
  @scala.inline
  def AnyAaaaRecord(address: String, ttl: Double): tmttyped.node.dnsMod.AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AAAA")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyAaaaRecord]
  }
  
  @scala.inline
  def AnyCnameRecord(value: String): tmttyped.node.dnsMod.AnyCnameRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CNAME")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyCnameRecord]
  }
  
  @scala.inline
  def AnyMxRecord(exchange: String, priority: Double): tmttyped.node.dnsMod.AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MX")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyMxRecord]
  }
  
  @scala.inline
  def AnyNaptrRecord(
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String
  ): tmttyped.node.dnsMod.AnyNaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NAPTR")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyNaptrRecord]
  }
  
  @scala.inline
  def AnyNsRecord(value: String): tmttyped.node.dnsMod.AnyNsRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NS")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyNsRecord]
  }
  
  @scala.inline
  def AnyPtrRecord(value: String): tmttyped.node.dnsMod.AnyPtrRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PTR")
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
    serial: Double
  ): tmttyped.node.dnsMod.AnySoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SOA")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnySoaRecord]
  }
  
  @scala.inline
  def AnySrvRecord(name: String, port: Double, priority: Double, weight: Double): tmttyped.node.dnsMod.AnySrvRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SRV")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnySrvRecord]
  }
  
  @scala.inline
  def AnyTxtRecord(entries: js.Array[String]): tmttyped.node.dnsMod.AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TXT")
    __obj.asInstanceOf[tmttyped.node.dnsMod.AnyTxtRecord]
  }
}

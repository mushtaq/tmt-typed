package tmttyped.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaaRecord extends StObject {
  
  var contactemail: js.UndefOr[String] = js.undefined
  
  var contactphone: js.UndefOr[String] = js.undefined
  
  var critial: Double
  
  var iodef: js.UndefOr[String] = js.undefined
  
  var issue: js.UndefOr[String] = js.undefined
  
  var issuewild: js.UndefOr[String] = js.undefined
}
object CaaRecord {
  
  @scala.inline
  def apply(critial: Double): CaaRecord = {
    val __obj = js.Dynamic.literal(critial = critial.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaaRecord]
  }
  
  @scala.inline
  implicit class CaaRecordMutableBuilder[Self <: CaaRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactemail(value: String): Self = StObject.set(x, "contactemail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactemailUndefined: Self = StObject.set(x, "contactemail", js.undefined)
    
    @scala.inline
    def setContactphone(value: String): Self = StObject.set(x, "contactphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactphoneUndefined: Self = StObject.set(x, "contactphone", js.undefined)
    
    @scala.inline
    def setCritial(value: Double): Self = StObject.set(x, "critial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIodef(value: String): Self = StObject.set(x, "iodef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIodefUndefined: Self = StObject.set(x, "iodef", js.undefined)
    
    @scala.inline
    def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    @scala.inline
    def setIssuewild(value: String): Self = StObject.set(x, "issuewild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuewildUndefined: Self = StObject.set(x, "issuewild", js.undefined)
  }
}

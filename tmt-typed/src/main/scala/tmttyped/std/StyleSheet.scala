package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface. */
trait StyleSheet extends StObject {
  
  var disabled: scala.Boolean
  
  val href: java.lang.String | Null
  
  val media: org.scalajs.dom.raw.MediaList
  
  val ownerNode: org.scalajs.dom.raw.Element | org.scalajs.dom.raw.ProcessingInstruction | Null
  
  val parentStyleSheet: org.scalajs.dom.raw.CSSStyleSheet | Null
  
  val title: java.lang.String | Null
  
  val `type`: java.lang.String
}
object StyleSheet {
  
  @scala.inline
  def apply(disabled: scala.Boolean, media: org.scalajs.dom.raw.MediaList, `type`: java.lang.String): org.scalajs.dom.raw.StyleSheet = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.StyleSheet]
  }
  
  @scala.inline
  implicit class StyleSheetMutableBuilder[Self <: org.scalajs.dom.raw.StyleSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: scala.Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefNull: Self = StObject.set(x, "href", null)
    
    @scala.inline
    def setMedia(value: org.scalajs.dom.raw.MediaList): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNode(value: org.scalajs.dom.raw.Element | org.scalajs.dom.raw.ProcessingInstruction): Self = StObject.set(x, "ownerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNodeElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "ownerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNodeNull: Self = StObject.set(x, "ownerNode", null)
    
    @scala.inline
    def setOwnerNodeProcessingInstruction(value: org.scalajs.dom.raw.ProcessingInstruction): Self = StObject.set(x, "ownerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: org.scalajs.dom.raw.CSSStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheetNull: Self = StObject.set(x, "parentStyleSheet", null)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

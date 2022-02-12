package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementInternals
  extends StObject
     with ARIAMixin {
  
  /** Returns the ShadowRoot for internals's target element, if the target element is a shadow host, or null otherwise. */
  /* standard DOM */
  val shadowRoot: ShadowRoot | Null
}
object ElementInternals {
  
  @scala.inline
  def apply(
    ariaAtomic: java.lang.String,
    ariaAutoComplete: java.lang.String,
    ariaBusy: java.lang.String,
    ariaChecked: java.lang.String,
    ariaColCount: java.lang.String,
    ariaColIndex: java.lang.String,
    ariaColSpan: java.lang.String,
    ariaCurrent: java.lang.String,
    ariaDisabled: java.lang.String,
    ariaExpanded: java.lang.String,
    ariaHasPopup: java.lang.String,
    ariaHidden: java.lang.String,
    ariaKeyShortcuts: java.lang.String,
    ariaLabel: java.lang.String,
    ariaLevel: java.lang.String,
    ariaLive: java.lang.String,
    ariaModal: java.lang.String,
    ariaMultiLine: java.lang.String,
    ariaMultiSelectable: java.lang.String,
    ariaOrientation: java.lang.String,
    ariaPlaceholder: java.lang.String,
    ariaPosInSet: java.lang.String,
    ariaPressed: java.lang.String,
    ariaReadOnly: java.lang.String,
    ariaRequired: java.lang.String,
    ariaRoleDescription: java.lang.String,
    ariaRowCount: java.lang.String,
    ariaRowIndex: java.lang.String,
    ariaRowSpan: java.lang.String,
    ariaSelected: java.lang.String,
    ariaSetSize: java.lang.String,
    ariaSort: java.lang.String,
    ariaValueMax: java.lang.String,
    ariaValueMin: java.lang.String,
    ariaValueNow: java.lang.String,
    ariaValueText: java.lang.String
  ): ElementInternals = {
    val __obj = js.Dynamic.literal(ariaAtomic = ariaAtomic.asInstanceOf[js.Any], ariaAutoComplete = ariaAutoComplete.asInstanceOf[js.Any], ariaBusy = ariaBusy.asInstanceOf[js.Any], ariaChecked = ariaChecked.asInstanceOf[js.Any], ariaColCount = ariaColCount.asInstanceOf[js.Any], ariaColIndex = ariaColIndex.asInstanceOf[js.Any], ariaColSpan = ariaColSpan.asInstanceOf[js.Any], ariaCurrent = ariaCurrent.asInstanceOf[js.Any], ariaDisabled = ariaDisabled.asInstanceOf[js.Any], ariaExpanded = ariaExpanded.asInstanceOf[js.Any], ariaHasPopup = ariaHasPopup.asInstanceOf[js.Any], ariaHidden = ariaHidden.asInstanceOf[js.Any], ariaKeyShortcuts = ariaKeyShortcuts.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any], ariaLevel = ariaLevel.asInstanceOf[js.Any], ariaLive = ariaLive.asInstanceOf[js.Any], ariaModal = ariaModal.asInstanceOf[js.Any], ariaMultiLine = ariaMultiLine.asInstanceOf[js.Any], ariaMultiSelectable = ariaMultiSelectable.asInstanceOf[js.Any], ariaOrientation = ariaOrientation.asInstanceOf[js.Any], ariaPlaceholder = ariaPlaceholder.asInstanceOf[js.Any], ariaPosInSet = ariaPosInSet.asInstanceOf[js.Any], ariaPressed = ariaPressed.asInstanceOf[js.Any], ariaReadOnly = ariaReadOnly.asInstanceOf[js.Any], ariaRequired = ariaRequired.asInstanceOf[js.Any], ariaRoleDescription = ariaRoleDescription.asInstanceOf[js.Any], ariaRowCount = ariaRowCount.asInstanceOf[js.Any], ariaRowIndex = ariaRowIndex.asInstanceOf[js.Any], ariaRowSpan = ariaRowSpan.asInstanceOf[js.Any], ariaSelected = ariaSelected.asInstanceOf[js.Any], ariaSetSize = ariaSetSize.asInstanceOf[js.Any], ariaSort = ariaSort.asInstanceOf[js.Any], ariaValueMax = ariaValueMax.asInstanceOf[js.Any], ariaValueMin = ariaValueMin.asInstanceOf[js.Any], ariaValueNow = ariaValueNow.asInstanceOf[js.Any], ariaValueText = ariaValueText.asInstanceOf[js.Any], shadowRoot = null)
    __obj.asInstanceOf[ElementInternals]
  }
  
  @scala.inline
  implicit class ElementInternalsMutableBuilder[Self <: ElementInternals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShadowRoot(value: ShadowRoot): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRootNull: Self = StObject.set(x, "shadowRoot", null)
  }
}

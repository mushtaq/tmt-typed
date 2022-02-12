package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid. */
trait ValidityState extends StObject {
  
  /* standard DOM */
  val badInput: scala.Boolean
  
  /* standard DOM */
  val customError: scala.Boolean
  
  /* standard DOM */
  val patternMismatch: scala.Boolean
  
  /* standard DOM */
  val rangeOverflow: scala.Boolean
  
  /* standard DOM */
  val rangeUnderflow: scala.Boolean
  
  /* standard DOM */
  val stepMismatch: scala.Boolean
  
  /* standard DOM */
  val tooLong: scala.Boolean
  
  /* standard DOM */
  val tooShort: scala.Boolean
  
  /* standard DOM */
  val typeMismatch: scala.Boolean
  
  /* standard DOM */
  val valid: scala.Boolean
  
  /* standard DOM */
  val valueMissing: scala.Boolean
}
object ValidityState {
  
  @scala.inline
  def apply(
    badInput: scala.Boolean,
    customError: scala.Boolean,
    patternMismatch: scala.Boolean,
    rangeOverflow: scala.Boolean,
    rangeUnderflow: scala.Boolean,
    stepMismatch: scala.Boolean,
    tooLong: scala.Boolean,
    tooShort: scala.Boolean,
    typeMismatch: scala.Boolean,
    valid: scala.Boolean,
    valueMissing: scala.Boolean
  ): ValidityState = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], customError = customError.asInstanceOf[js.Any], patternMismatch = patternMismatch.asInstanceOf[js.Any], rangeOverflow = rangeOverflow.asInstanceOf[js.Any], rangeUnderflow = rangeUnderflow.asInstanceOf[js.Any], stepMismatch = stepMismatch.asInstanceOf[js.Any], tooLong = tooLong.asInstanceOf[js.Any], tooShort = tooShort.asInstanceOf[js.Any], typeMismatch = typeMismatch.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], valueMissing = valueMissing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidityState]
  }
  
  @scala.inline
  implicit class ValidityStateMutableBuilder[Self <: ValidityState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadInput(value: scala.Boolean): Self = StObject.set(x, "badInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomError(value: scala.Boolean): Self = StObject.set(x, "customError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternMismatch(value: scala.Boolean): Self = StObject.set(x, "patternMismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeOverflow(value: scala.Boolean): Self = StObject.set(x, "rangeOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUnderflow(value: scala.Boolean): Self = StObject.set(x, "rangeUnderflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMismatch(value: scala.Boolean): Self = StObject.set(x, "stepMismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooLong(value: scala.Boolean): Self = StObject.set(x, "tooLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooShort(value: scala.Boolean): Self = StObject.set(x, "tooShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeMismatch(value: scala.Boolean): Self = StObject.set(x, "typeMismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: scala.Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMissing(value: scala.Boolean): Self = StObject.set(x, "valueMissing", value.asInstanceOf[js.Any])
  }
}

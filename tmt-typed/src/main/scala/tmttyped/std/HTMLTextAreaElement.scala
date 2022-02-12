package tmttyped.std

import tmttyped.std.stdStrings.backward
import tmttyped.std.stdStrings.forward
import tmttyped.std.stdStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods for manipulating the layout and presentation of <textarea> elements. */
@js.native
trait HTMLTextAreaElement
  extends StObject
     with HTMLElement {
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  var autocomplete: java.lang.String = js.native
  
  /** Returns whether a form will validate when it is submitted, without having to submit it. */
  /* standard DOM */
  def checkValidity(): scala.Boolean = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard DOM */
  var cols: Double = js.native
  
  /** Sets or retrieves the initial contents of the object. */
  /* standard DOM */
  var defaultValue: java.lang.String = js.native
  
  /* standard DOM */
  var dirName: java.lang.String = js.native
  
  /* standard DOM */
  var disabled: scala.Boolean = js.native
  
  /** Retrieves a reference to the form that the object is embedded in. */
  /* standard DOM */
  val form: org.scalajs.dom.HTMLFormElement | Null = js.native
  
  /* standard DOM */
  val labels: org.scalajs.dom.NodeList[org.scalajs.dom.HTMLLabelElement with org.scalajs.dom.Node] = js.native
  
  /** Sets or retrieves the maximum number of characters that the user can enter in a text control. */
  /* standard DOM */
  var maxLength: Double = js.native
  
  /* standard DOM */
  var minLength: Double = js.native
  
  /** Sets or retrieves the name of the object. */
  /* standard DOM */
  var name: java.lang.String = js.native
  
  /** Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field. */
  /* standard DOM */
  var placeholder: java.lang.String = js.native
  
  /** Sets or retrieves the value indicated whether the content of the object is read-only. */
  /* standard DOM */
  var readOnly: scala.Boolean = js.native
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* standard DOM */
  def reportValidity(): scala.Boolean = js.native
  
  /** When present, marks an element that can't be submitted without a value. */
  /* standard DOM */
  var required: scala.Boolean = js.native
  
  /** Sets or retrieves the number of horizontal rows contained in the object. */
  /* standard DOM */
  var rows: Double = js.native
  
  /** Highlights the input area of a form element. */
  /* standard DOM */
  def select(): Unit = js.native
  
  /* standard DOM */
  var selectionDirection: forward | backward | none = js.native
  
  /** Gets or sets the end position or offset of a text selection. */
  /* standard DOM */
  var selectionEnd: Double = js.native
  
  /** Gets or sets the starting position or offset of a text selection. */
  /* standard DOM */
  var selectionStart: Double = js.native
  
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  /* standard DOM */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /* standard DOM */
  def setRangeText(replacement: java.lang.String): Unit = js.native
  /* standard DOM */
  def setRangeText(replacement: java.lang.String, start: Double, end: Double): Unit = js.native
  def setRangeText(replacement: java.lang.String, start: Double, end: Double, selectionMode: SelectionMode): Unit = js.native
  
  /**
    * Sets the start and end positions of a selection in a text field.
    * @param start The offset into the text field for the start of the selection.
    * @param end The offset into the text field for the end of the selection.
    * @param direction The direction in which the selection is performed.
    */
  /* standard DOM */
  def setSelectionRange(): Unit = js.native
  def setSelectionRange(start: Double): Unit = js.native
  def setSelectionRange(start: Double, end: Double): Unit = js.native
  def setSelectionRange(start: Double, end: Double, direction: forward | backward | none): Unit = js.native
  def setSelectionRange(start: Double, end: Null, direction: forward | backward | none): Unit = js.native
  def setSelectionRange(start: Null, end: Double): Unit = js.native
  def setSelectionRange(start: Null, end: Double, direction: forward | backward | none): Unit = js.native
  def setSelectionRange(start: Null, end: Null, direction: forward | backward | none): Unit = js.native
  
  /* standard DOM */
  val textLength: Double = js.native
  
  /** Retrieves the type of control. */
  /* standard DOM */
  val `type`: java.lang.String = js.native
  
  /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
  /* standard DOM */
  val validationMessage: java.lang.String = js.native
  
  /** Returns a  ValidityState object that represents the validity states of an element. */
  /* standard DOM */
  val validity: org.scalajs.dom.ValidityState = js.native
  
  /** Retrieves or sets the text in the entry field of the textArea element. */
  /* standard DOM */
  var value: java.lang.String = js.native
  
  /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
  /* standard DOM */
  val willValidate: scala.Boolean = js.native
  
  /** Sets or retrieves how to handle wordwrapping in the object. */
  /* standard DOM */
  var wrap: java.lang.String = js.native
}

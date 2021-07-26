package tmttyped.std

import tmttyped.std.stdStrings.payerdetailchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Payment Request API interface is returned after a user selects a payment method and approves a payment request. */
@js.native
trait PaymentResponse
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def complete(): js.Promise[Unit] = js.native
  def complete(result: PaymentComplete): js.Promise[Unit] = js.native
  
  val details: js.Any = js.native
  
  val methodName: java.lang.String = js.native
  
  var onpayerdetailchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]) | Null = js.native
  
  val payerEmail: java.lang.String | Null = js.native
  
  val payerName: java.lang.String | Null = js.native
  
  val payerPhone: java.lang.String | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  val requestId: java.lang.String = js.native
  
  def retry(): js.Promise[Unit] = js.native
  def retry(errorFields: PaymentValidationErrors): js.Promise[Unit] = js.native
  
  val shippingAddress: PaymentAddress | Null = js.native
  
  val shippingOption: java.lang.String | Null = js.native
  
  def toJSON(): js.Any = js.native
}

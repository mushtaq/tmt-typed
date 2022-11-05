package tmttyped.std.global

import tmttyped.std.PaymentDetailsInit
import tmttyped.std.PaymentMethodData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PaymentRequest")
@js.native
open class PaymentRequest protected ()
  extends StObject
     with tmttyped.std.PaymentRequest {
  /* standard DOM */
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetailsInit) = this()
}

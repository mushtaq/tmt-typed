package tmttyped.std.global

import org.scalajs.dom.PushEncryptionKeyName
import org.scalajs.dom.PushSubscriptionJSON
import tmttyped.std.EpochTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PushSubscription")
@js.native
/* standard DOM */
open class PushSubscription ()
  extends StObject
     with tmttyped.std.PushSubscription {
  
  /* standard DOM */
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val expirationTime: EpochTimeStamp | Null = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val options: org.scalajs.dom.PushSubscriptionOptions = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def toJSON(): PushSubscriptionJSON = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}

package tmttyped.rsocketFlowable

import tmttyped.rsocketFlowable.flowableMod.Source
import tmttyped.rsocketFlowable.flowableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-flowable", "Flowable")
  @js.native
  class Flowable[T] protected () extends default[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  /* static members */
  object Flowable {
    
    @JSImport("rsocket-flowable", "Flowable.error")
    @js.native
    def error(error: js.Error): tmttyped.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = js.native
    
    @JSImport("rsocket-flowable", "Flowable.just")
    @js.native
    def just[U](values: U*): tmttyped.rsocketFlowable.flowableMod.Flowable[U] = js.native
    
    @JSImport("rsocket-flowable", "Flowable.never")
    @js.native
    def never(): tmttyped.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = js.native
  }
  
  @JSImport("rsocket-flowable", "FlowableProcessor")
  @js.native
  class FlowableProcessor[T, R] protected ()
    extends tmttyped.rsocketFlowable.flowableProcessorMod.default[T, R] {
    def this(source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any) = this()
    def this(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any,
      fn: js.Function1[/* a */ T, R]
    ) = this()
  }
  
  @JSImport("rsocket-flowable", "Single")
  @js.native
  class Single[T] protected ()
    extends tmttyped.rsocketFlowable.singleMod.default[T] {
    def this(source: tmttyped.rsocketFlowable.singleMod.Source[T]) = this()
  }
  /* static members */
  object Single {
    
    @JSImport("rsocket-flowable", "Single.error")
    @js.native
    def error(error: js.Error): tmttyped.rsocketFlowable.singleMod.Single[scala.Nothing] = js.native
    
    @JSImport("rsocket-flowable", "Single.never")
    @js.native
    def never(): tmttyped.rsocketFlowable.singleMod.Single[scala.Nothing] = js.native
    
    @JSImport("rsocket-flowable", "Single.of")
    @js.native
    def of[U](value: U): tmttyped.rsocketFlowable.singleMod.Single[U] = js.native
  }
  
  @JSImport("rsocket-flowable", "every")
  @js.native
  def every(ms: Double): default[Double] = js.native
}

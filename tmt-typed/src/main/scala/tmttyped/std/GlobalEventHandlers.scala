package tmttyped.std

import tmttyped.std.stdStrings.abort
import tmttyped.std.stdStrings.animationcancel
import tmttyped.std.stdStrings.animationend
import tmttyped.std.stdStrings.animationiteration
import tmttyped.std.stdStrings.animationstart
import tmttyped.std.stdStrings.auxclick
import tmttyped.std.stdStrings.beforeinput
import tmttyped.std.stdStrings.blur
import tmttyped.std.stdStrings.canplay
import tmttyped.std.stdStrings.canplaythrough
import tmttyped.std.stdStrings.change
import tmttyped.std.stdStrings.click
import tmttyped.std.stdStrings.close
import tmttyped.std.stdStrings.compositionend
import tmttyped.std.stdStrings.compositionstart
import tmttyped.std.stdStrings.compositionupdate
import tmttyped.std.stdStrings.contextmenu
import tmttyped.std.stdStrings.cuechange
import tmttyped.std.stdStrings.dblclick
import tmttyped.std.stdStrings.drag
import tmttyped.std.stdStrings.dragend
import tmttyped.std.stdStrings.dragenter
import tmttyped.std.stdStrings.dragleave
import tmttyped.std.stdStrings.dragover
import tmttyped.std.stdStrings.dragstart
import tmttyped.std.stdStrings.drop
import tmttyped.std.stdStrings.durationchange
import tmttyped.std.stdStrings.emptied
import tmttyped.std.stdStrings.ended
import tmttyped.std.stdStrings.error
import tmttyped.std.stdStrings.focus
import tmttyped.std.stdStrings.focusin
import tmttyped.std.stdStrings.focusout
import tmttyped.std.stdStrings.formdata
import tmttyped.std.stdStrings.gotpointercapture
import tmttyped.std.stdStrings.input
import tmttyped.std.stdStrings.invalid
import tmttyped.std.stdStrings.keydown
import tmttyped.std.stdStrings.keypress
import tmttyped.std.stdStrings.keyup
import tmttyped.std.stdStrings.load
import tmttyped.std.stdStrings.loadeddata
import tmttyped.std.stdStrings.loadedmetadata
import tmttyped.std.stdStrings.loadstart
import tmttyped.std.stdStrings.lostpointercapture
import tmttyped.std.stdStrings.mousedown
import tmttyped.std.stdStrings.mouseenter
import tmttyped.std.stdStrings.mouseleave
import tmttyped.std.stdStrings.mousemove
import tmttyped.std.stdStrings.mouseout
import tmttyped.std.stdStrings.mouseover
import tmttyped.std.stdStrings.mouseup
import tmttyped.std.stdStrings.pause
import tmttyped.std.stdStrings.play
import tmttyped.std.stdStrings.playing
import tmttyped.std.stdStrings.pointercancel
import tmttyped.std.stdStrings.pointerdown
import tmttyped.std.stdStrings.pointerenter
import tmttyped.std.stdStrings.pointerleave
import tmttyped.std.stdStrings.pointermove
import tmttyped.std.stdStrings.pointerout
import tmttyped.std.stdStrings.pointerover
import tmttyped.std.stdStrings.pointerup
import tmttyped.std.stdStrings.progress
import tmttyped.std.stdStrings.ratechange
import tmttyped.std.stdStrings.reset
import tmttyped.std.stdStrings.resize
import tmttyped.std.stdStrings.scroll
import tmttyped.std.stdStrings.securitypolicyviolation
import tmttyped.std.stdStrings.seeked
import tmttyped.std.stdStrings.seeking
import tmttyped.std.stdStrings.select
import tmttyped.std.stdStrings.selectionchange
import tmttyped.std.stdStrings.selectstart
import tmttyped.std.stdStrings.slotchange
import tmttyped.std.stdStrings.stalled
import tmttyped.std.stdStrings.submit
import tmttyped.std.stdStrings.suspend
import tmttyped.std.stdStrings.timeupdate
import tmttyped.std.stdStrings.toggle
import tmttyped.std.stdStrings.touchcancel
import tmttyped.std.stdStrings.touchend
import tmttyped.std.stdStrings.touchmove
import tmttyped.std.stdStrings.touchstart
import tmttyped.std.stdStrings.transitioncancel
import tmttyped.std.stdStrings.transitionend
import tmttyped.std.stdStrings.transitionrun
import tmttyped.std.stdStrings.transitionstart
import tmttyped.std.stdStrings.volumechange
import tmttyped.std.stdStrings.waiting
import tmttyped.std.stdStrings.webkitanimationend
import tmttyped.std.stdStrings.webkitanimationiteration
import tmttyped.std.stdStrings.webkitanimationstart
import tmttyped.std.stdStrings.webkittransitionend
import tmttyped.std.stdStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalEventHandlers extends StObject {
  
  /* standard DOM */
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard DOM */
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Fires when the user aborts the download.
    * @param ev The event.
    */
  /* standard DOM */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires when the object loses the input focus.
    * @param ev The focus event.
    */
  /* standard DOM */
  var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null = js.native
  
  /**
    * Occurs when playback is possible, but would require further buffering.
    * @param ev The event.
    */
  /* standard DOM */
  var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the contents of the object or selection have changed.
    * @param ev The event.
    */
  /* standard DOM */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the user clicks the left mouse button on the object
    * @param ev The mouse event.
    */
  /* standard DOM */
  var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the user clicks the right mouse button in the client area, opening the context menu.
    * @param ev The mouse event.
    */
  /* standard DOM */
  var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the user double-clicks the object.
    * @param ev The mouse event.
    */
  /* standard DOM */
  var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires on the source object continuously during a drag operation.
    * @param ev The event.
    */
  /* standard DOM */
  var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the source object when the user releases the mouse at the close of a drag operation.
    * @param ev The event.
    */
  /* standard DOM */
  var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the target element when the user drags the object to a valid drop target.
    * @param ev The drag event.
    */
  /* standard DOM */
  var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
    * @param ev The drag event.
    */
  /* standard DOM */
  var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the target element continuously while the user drags the object over a valid drop target.
    * @param ev The event.
    */
  /* standard DOM */
  var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Fires on the source object when the user starts to drag a text selection or selected object.
    * @param ev The event.
    */
  /* standard DOM */
  var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.native
  
  /**
    * Occurs when the duration attribute is updated.
    * @param ev The event.
    */
  /* standard DOM */
  var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the media element is reset to its initial state.
    * @param ev The event.
    */
  /* standard DOM */
  var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the end of playback is reached.
    * @param ev The event
    */
  /* standard DOM */
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    */
  /* standard DOM */
  var onerror: OnErrorEventHandler = js.native
  
  /**
    * Fires when the object receives focus.
    * @param ev The event.
    */
  /* standard DOM */
  var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onformdata: (js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the user presses a key.
    * @param ev The keyboard event
    */
  /* standard DOM */
  var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user presses an alphanumeric key.
    * @param ev The event.
    * @deprecated
    */
  /* standard DOM */
  var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user releases a key.
    * @param ev The keyboard event
    */
  /* standard DOM */
  var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null = js.native
  
  /**
    * Fires immediately after the browser loads the object.
    * @param ev The event.
    */
  /* standard DOM */
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when media data is loaded at the current playback position.
    * @param ev The event.
    */
  /* standard DOM */
  var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the duration and dimensions of the media have been determined.
    * @param ev The event.
    */
  /* standard DOM */
  var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when Internet Explorer begins looking for media data.
    * @param ev The event.
    */
  /* standard DOM */
  var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user clicks the object with either mouse button.
    * @param ev The mouse event.
    */
  /* standard DOM */
  var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user moves the mouse over the object.
    * @param ev The mouse event.
    */
  /* standard DOM */
  var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user moves the mouse pointer outside the boundaries of the object.
    * @param ev The mouse event.
    */
  /* standard DOM */
  var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user moves the mouse pointer into the object.
    * @param ev The mouse event.
    */
  /* standard DOM */
  var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user releases a mouse button while the mouse is over the object.
    * @param ev The mouse event.
    */
  /* standard DOM */
  var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.native
  
  /**
    * Occurs when playback is paused.
    * @param ev The event.
    */
  /* standard DOM */
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the play method is requested.
    * @param ev The event.
    */
  /* standard DOM */
  var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the audio or video has started playing.
    * @param ev The event.
    */
  /* standard DOM */
  var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.native
  
  /**
    * Occurs to indicate progress while downloading media data.
    * @param ev The event.
    */
  /* standard DOM */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any]) | Null = js.native
  
  /**
    * Occurs when the playback rate is increased or decreased.
    * @param ev The event.
    */
  /* standard DOM */
  var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the user resets a form.
    * @param ev The event.
    */
  /* standard DOM */
  var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null = js.native
  
  /**
    * Fires when the user repositions the scroll box in the scroll bar on the object.
    * @param ev The event.
    */
  /* standard DOM */
  var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]) | Null = js.native
  
  /**
    * Occurs when the seek operation ends.
    * @param ev The event.
    */
  /* standard DOM */
  var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the current playback position is moved.
    * @param ev The event.
    */
  /* standard DOM */
  var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Fires when the current selection changes.
    * @param ev The event.
    */
  /* standard DOM */
  var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onselectionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onselectstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onslotchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when the download has stopped.
    * @param ev The event.
    */
  /* standard DOM */
  var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]) | Null = js.native
  
  /**
    * Occurs if the load operation has been intentionally halted.
    * @param ev The event.
    */
  /* standard DOM */
  var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs to indicate the current playback position.
    * @param ev The event.
    */
  /* standard DOM */
  var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var ontouchcancel: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
  ] = js.native
  
  /* standard DOM */
  var ontouchend: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
  ] = js.native
  
  /* standard DOM */
  var ontouchmove: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
  ] = js.native
  
  /* standard DOM */
  var ontouchstart: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
  ] = js.native
  
  /* standard DOM */
  var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.native
  
  /* standard DOM */
  var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.native
  
  /**
    * Occurs when the volume is changed, or playback is muted or unmuted.
    * @param ev The event.
    */
  /* standard DOM */
  var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /**
    * Occurs when playback stops because the next frame of a video resource is not available.
    * @param ev The event.
    */
  /* standard DOM */
  var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** @deprecated This is a legacy alias of `onanimationend`. */
  /* standard DOM */
  var onwebkitanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** @deprecated This is a legacy alias of `onanimationiteration`. */
  /* standard DOM */
  var onwebkitanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** @deprecated This is a legacy alias of `onanimationstart`. */
  /* standard DOM */
  var onwebkitanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** @deprecated This is a legacy alias of `ontransitionend`. */
  /* standard DOM */
  var onwebkittransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard DOM */
  var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any]) | Null = js.native
  
  /* standard DOM */
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* standard DOM */
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.AnimationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeinput(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeinput(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionend(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstart(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionupdate(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.CompositionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DragEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.FocusEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formdata(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formdata(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.MouseEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.PointerEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.UIEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_slotchange(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TouchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.TransitionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationend(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationiteration(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkitanimationstart(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_webkittransitionend(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.WheelEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
}

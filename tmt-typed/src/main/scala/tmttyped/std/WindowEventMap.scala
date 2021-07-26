package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEventMap
  extends StObject
     with GlobalEventHandlersEventMap
     with WindowEventHandlersEventMap {
  
  var compassneedscalibration: org.scalajs.dom.raw.Event
  
  var devicemotion: org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
  
  var deviceorientation: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
  
  var deviceorientationabsolute: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
  
  var gamepadconnected: org.scalajs.dom.experimental.gamepad.GamepadEvent
  
  var gamepaddisconnected: org.scalajs.dom.experimental.gamepad.GamepadEvent
  
  var mousewheel: org.scalajs.dom.raw.Event
  
  var orientationchange: org.scalajs.dom.raw.Event
  
  var readystatechange: org.scalajs.dom.raw.ProgressEvent
  
  var vrdisplayactivate: org.scalajs.dom.raw.Event
  
  var vrdisplayblur: org.scalajs.dom.raw.Event
  
  var vrdisplayconnect: org.scalajs.dom.raw.Event
  
  var vrdisplaydeactivate: org.scalajs.dom.raw.Event
  
  var vrdisplaydisconnect: org.scalajs.dom.raw.Event
  
  var vrdisplaypresentchange: org.scalajs.dom.raw.Event
}
object WindowEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.UIEvent,
    afterprint: org.scalajs.dom.raw.Event,
    animationcancel: org.scalajs.dom.raw.AnimationEvent,
    animationend: org.scalajs.dom.raw.AnimationEvent,
    animationiteration: org.scalajs.dom.raw.AnimationEvent,
    animationstart: org.scalajs.dom.raw.AnimationEvent,
    auxclick: org.scalajs.dom.raw.MouseEvent,
    beforeinput: InputEvent,
    beforeprint: org.scalajs.dom.raw.Event,
    beforeunload: org.scalajs.dom.raw.BeforeUnloadEvent,
    blur: org.scalajs.dom.raw.FocusEvent,
    cancel: org.scalajs.dom.raw.Event,
    canplay: org.scalajs.dom.raw.Event,
    canplaythrough: org.scalajs.dom.raw.Event,
    change: org.scalajs.dom.raw.Event,
    click: org.scalajs.dom.raw.MouseEvent,
    close: org.scalajs.dom.raw.Event,
    compassneedscalibration: org.scalajs.dom.raw.Event,
    compositionend: org.scalajs.dom.raw.CompositionEvent,
    compositionstart: org.scalajs.dom.raw.CompositionEvent,
    compositionupdate: org.scalajs.dom.raw.CompositionEvent,
    contextmenu: org.scalajs.dom.raw.MouseEvent,
    cuechange: org.scalajs.dom.raw.Event,
    dblclick: org.scalajs.dom.raw.MouseEvent,
    devicemotion: org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent,
    deviceorientation: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent,
    deviceorientationabsolute: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent,
    drag: org.scalajs.dom.raw.DragEvent,
    dragend: org.scalajs.dom.raw.DragEvent,
    dragenter: org.scalajs.dom.raw.DragEvent,
    dragexit: org.scalajs.dom.raw.Event,
    dragleave: org.scalajs.dom.raw.DragEvent,
    dragover: org.scalajs.dom.raw.DragEvent,
    dragstart: org.scalajs.dom.raw.DragEvent,
    drop: org.scalajs.dom.raw.DragEvent,
    durationchange: org.scalajs.dom.raw.Event,
    emptied: org.scalajs.dom.raw.Event,
    ended: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.ErrorEvent,
    focus: org.scalajs.dom.raw.FocusEvent,
    focusin: org.scalajs.dom.raw.FocusEvent,
    focusout: org.scalajs.dom.raw.FocusEvent,
    gamepadconnected: org.scalajs.dom.experimental.gamepad.GamepadEvent,
    gamepaddisconnected: org.scalajs.dom.experimental.gamepad.GamepadEvent,
    gotpointercapture: org.scalajs.dom.raw.PointerEvent,
    hashchange: org.scalajs.dom.raw.HashChangeEvent,
    input: org.scalajs.dom.raw.Event,
    invalid: org.scalajs.dom.raw.Event,
    keydown: org.scalajs.dom.raw.KeyboardEvent,
    keypress: org.scalajs.dom.raw.KeyboardEvent,
    keyup: org.scalajs.dom.raw.KeyboardEvent,
    languagechange: org.scalajs.dom.raw.Event,
    load: org.scalajs.dom.raw.Event,
    loadeddata: org.scalajs.dom.raw.Event,
    loadedmetadata: org.scalajs.dom.raw.Event,
    loadstart: org.scalajs.dom.raw.Event,
    lostpointercapture: org.scalajs.dom.raw.PointerEvent,
    message: org.scalajs.dom.raw.MessageEvent,
    messageerror: org.scalajs.dom.raw.MessageEvent,
    mousedown: org.scalajs.dom.raw.MouseEvent,
    mouseenter: org.scalajs.dom.raw.MouseEvent,
    mouseleave: org.scalajs.dom.raw.MouseEvent,
    mousemove: org.scalajs.dom.raw.MouseEvent,
    mouseout: org.scalajs.dom.raw.MouseEvent,
    mouseover: org.scalajs.dom.raw.MouseEvent,
    mouseup: org.scalajs.dom.raw.MouseEvent,
    mousewheel: org.scalajs.dom.raw.Event,
    offline: org.scalajs.dom.raw.Event,
    online: org.scalajs.dom.raw.Event,
    orientationchange: org.scalajs.dom.raw.Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    pause: org.scalajs.dom.raw.Event,
    play: org.scalajs.dom.raw.Event,
    playing: org.scalajs.dom.raw.Event,
    pointercancel: org.scalajs.dom.raw.PointerEvent,
    pointerdown: org.scalajs.dom.raw.PointerEvent,
    pointerenter: org.scalajs.dom.raw.PointerEvent,
    pointerleave: org.scalajs.dom.raw.PointerEvent,
    pointermove: org.scalajs.dom.raw.PointerEvent,
    pointerout: org.scalajs.dom.raw.PointerEvent,
    pointerover: org.scalajs.dom.raw.PointerEvent,
    pointerup: org.scalajs.dom.raw.PointerEvent,
    popstate: org.scalajs.dom.raw.PopStateEvent,
    progress: org.scalajs.dom.raw.ProgressEvent,
    ratechange: org.scalajs.dom.raw.Event,
    readystatechange: org.scalajs.dom.raw.ProgressEvent,
    rejectionhandled: PromiseRejectionEvent,
    reset: org.scalajs.dom.raw.Event,
    resize: org.scalajs.dom.raw.UIEvent,
    scroll: org.scalajs.dom.raw.Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: org.scalajs.dom.raw.Event,
    seeking: org.scalajs.dom.raw.Event,
    select: org.scalajs.dom.raw.Event,
    selectionchange: org.scalajs.dom.raw.Event,
    selectstart: org.scalajs.dom.raw.Event,
    stalled: org.scalajs.dom.raw.Event,
    storage: org.scalajs.dom.raw.StorageEvent,
    submit: org.scalajs.dom.raw.Event,
    suspend: org.scalajs.dom.raw.Event,
    timeupdate: org.scalajs.dom.raw.Event,
    toggle: org.scalajs.dom.raw.Event,
    touchcancel: org.scalajs.dom.raw.TouchEvent,
    touchend: org.scalajs.dom.raw.TouchEvent,
    touchmove: org.scalajs.dom.raw.TouchEvent,
    touchstart: org.scalajs.dom.raw.TouchEvent,
    transitioncancel: org.scalajs.dom.raw.TransitionEvent,
    transitionend: org.scalajs.dom.raw.TransitionEvent,
    transitionrun: org.scalajs.dom.raw.TransitionEvent,
    transitionstart: org.scalajs.dom.raw.TransitionEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: org.scalajs.dom.raw.Event,
    volumechange: org.scalajs.dom.raw.Event,
    vrdisplayactivate: org.scalajs.dom.raw.Event,
    vrdisplayblur: org.scalajs.dom.raw.Event,
    vrdisplayconnect: org.scalajs.dom.raw.Event,
    vrdisplaydeactivate: org.scalajs.dom.raw.Event,
    vrdisplaydisconnect: org.scalajs.dom.raw.Event,
    vrdisplaypresentchange: org.scalajs.dom.raw.Event,
    waiting: org.scalajs.dom.raw.Event,
    wheel: org.scalajs.dom.raw.WheelEvent
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], afterprint = afterprint.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compassneedscalibration = compassneedscalibration.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], devicemotion = devicemotion.asInstanceOf[js.Any], deviceorientation = deviceorientation.asInstanceOf[js.Any], deviceorientationabsolute = deviceorientationabsolute.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], gamepadconnected = gamepadconnected.asInstanceOf[js.Any], gamepaddisconnected = gamepaddisconnected.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], orientationchange = orientationchange.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], vrdisplayactivate = vrdisplayactivate.asInstanceOf[js.Any], vrdisplayblur = vrdisplayblur.asInstanceOf[js.Any], vrdisplayconnect = vrdisplayconnect.asInstanceOf[js.Any], vrdisplaydeactivate = vrdisplaydeactivate.asInstanceOf[js.Any], vrdisplaydisconnect = vrdisplaydisconnect.asInstanceOf[js.Any], vrdisplaypresentchange = vrdisplaypresentchange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
  
  @scala.inline
  implicit class WindowEventMapMutableBuilder[Self <: WindowEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompassneedscalibration(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "compassneedscalibration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicemotion(value: org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent): Self = StObject.set(x, "devicemotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceorientation(value: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent): Self = StObject.set(x, "deviceorientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceorientationabsolute(value: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent): Self = StObject.set(x, "deviceorientationabsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamepadconnected(value: org.scalajs.dom.experimental.gamepad.GamepadEvent): Self = StObject.set(x, "gamepadconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamepaddisconnected(value: org.scalajs.dom.experimental.gamepad.GamepadEvent): Self = StObject.set(x, "gamepaddisconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousewheel(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationchange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "orientationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadystatechange(value: org.scalajs.dom.raw.ProgressEvent): Self = StObject.set(x, "readystatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrdisplayactivate(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "vrdisplayactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrdisplayblur(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "vrdisplayblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrdisplayconnect(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "vrdisplayconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrdisplaydeactivate(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "vrdisplaydeactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrdisplaydisconnect(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "vrdisplaydisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVrdisplaypresentchange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "vrdisplaypresentchange", value.asInstanceOf[js.Any])
  }
}

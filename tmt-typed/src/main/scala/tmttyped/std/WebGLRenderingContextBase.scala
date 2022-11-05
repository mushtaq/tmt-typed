package tmttyped.std

import tmttyped.std.stdStrings.ANGLE_instanced_arrays
import tmttyped.std.stdStrings.EXT_blend_minmax
import tmttyped.std.stdStrings.EXT_color_buffer_float
import tmttyped.std.stdStrings.EXT_color_buffer_half_float
import tmttyped.std.stdStrings.EXT_float_blend
import tmttyped.std.stdStrings.EXT_frag_depth
import tmttyped.std.stdStrings.EXT_sRGB
import tmttyped.std.stdStrings.EXT_shader_texture_lod
import tmttyped.std.stdStrings.EXT_texture_filter_anisotropic
import tmttyped.std.stdStrings.KHR_parallel_shader_compile
import tmttyped.std.stdStrings.OES_element_index_uint
import tmttyped.std.stdStrings.OES_standard_derivatives
import tmttyped.std.stdStrings.OES_texture_float
import tmttyped.std.stdStrings.OES_texture_float_linear
import tmttyped.std.stdStrings.OES_texture_half_float
import tmttyped.std.stdStrings.OES_texture_half_float_linear
import tmttyped.std.stdStrings.OES_vertex_array_object
import tmttyped.std.stdStrings.OVR_multiview2
import tmttyped.std.stdStrings.WEBGL_color_buffer_float
import tmttyped.std.stdStrings.WEBGL_compressed_texture_astc
import tmttyped.std.stdStrings.WEBGL_compressed_texture_etc
import tmttyped.std.stdStrings.WEBGL_compressed_texture_etc1
import tmttyped.std.stdStrings.WEBGL_compressed_texture_s3tc
import tmttyped.std.stdStrings.WEBGL_compressed_texture_s3tc_srgb
import tmttyped.std.stdStrings.WEBGL_debug_renderer_info
import tmttyped.std.stdStrings.WEBGL_debug_shaders
import tmttyped.std.stdStrings.WEBGL_depth_texture
import tmttyped.std.stdStrings.WEBGL_draw_buffers
import tmttyped.std.stdStrings.WEBGL_lose_context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderingContextBase extends StObject {
  
  /* standard DOM */
  val ACTIVE_ATTRIBUTES: GLenum = js.native
  
  /* standard DOM */
  val ACTIVE_TEXTURE: GLenum = js.native
  
  /* standard DOM */
  val ACTIVE_UNIFORMS: GLenum = js.native
  
  /* standard DOM */
  val ALIASED_LINE_WIDTH_RANGE: GLenum = js.native
  
  /* standard DOM */
  val ALIASED_POINT_SIZE_RANGE: GLenum = js.native
  
  /* standard DOM */
  val ALPHA: GLenum = js.native
  
  /* standard DOM */
  val ALPHA_BITS: GLenum = js.native
  
  /* standard DOM */
  val ALWAYS: GLenum = js.native
  
  /* standard DOM */
  val ARRAY_BUFFER: GLenum = js.native
  
  /* standard DOM */
  val ARRAY_BUFFER_BINDING: GLenum = js.native
  
  /* standard DOM */
  val ATTACHED_SHADERS: GLenum = js.native
  
  /* standard DOM */
  val BACK: GLenum = js.native
  
  /* standard DOM */
  val BLEND: GLenum = js.native
  
  /* standard DOM */
  val BLEND_COLOR: GLenum = js.native
  
  /* standard DOM */
  val BLEND_DST_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val BLEND_DST_RGB: GLenum = js.native
  
  /* standard DOM */
  val BLEND_EQUATION: GLenum = js.native
  
  /* standard DOM */
  val BLEND_EQUATION_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val BLEND_EQUATION_RGB: GLenum = js.native
  
  /* standard DOM */
  val BLEND_SRC_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val BLEND_SRC_RGB: GLenum = js.native
  
  /* standard DOM */
  val BLUE_BITS: GLenum = js.native
  
  /* standard DOM */
  val BOOL: GLenum = js.native
  
  /* standard DOM */
  val BOOL_VEC2: GLenum = js.native
  
  /* standard DOM */
  val BOOL_VEC3: GLenum = js.native
  
  /* standard DOM */
  val BOOL_VEC4: GLenum = js.native
  
  /* standard DOM */
  val BROWSER_DEFAULT_WEBGL: GLenum = js.native
  
  /* standard DOM */
  val BUFFER_SIZE: GLenum = js.native
  
  /* standard DOM */
  val BUFFER_USAGE: GLenum = js.native
  
  /* standard DOM */
  val BYTE: GLenum = js.native
  
  /* standard DOM */
  val CCW: GLenum = js.native
  
  /* standard DOM */
  val CLAMP_TO_EDGE: GLenum = js.native
  
  /* standard DOM */
  val COLOR_ATTACHMENT0: GLenum = js.native
  
  /* standard DOM */
  val COLOR_BUFFER_BIT: GLenum = js.native
  
  /* standard DOM */
  val COLOR_CLEAR_VALUE: GLenum = js.native
  
  /* standard DOM */
  val COLOR_WRITEMASK: GLenum = js.native
  
  /* standard DOM */
  val COMPILE_STATUS: GLenum = js.native
  
  /* standard DOM */
  val COMPRESSED_TEXTURE_FORMATS: GLenum = js.native
  
  /* standard DOM */
  val CONSTANT_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val CONSTANT_COLOR: GLenum = js.native
  
  /* standard DOM */
  val CONTEXT_LOST_WEBGL: GLenum = js.native
  
  /* standard DOM */
  val CULL_FACE: GLenum = js.native
  
  /* standard DOM */
  val CULL_FACE_MODE: GLenum = js.native
  
  /* standard DOM */
  val CURRENT_PROGRAM: GLenum = js.native
  
  /* standard DOM */
  val CURRENT_VERTEX_ATTRIB: GLenum = js.native
  
  /* standard DOM */
  val CW: GLenum = js.native
  
  /* standard DOM */
  val DECR: GLenum = js.native
  
  /* standard DOM */
  val DECR_WRAP: GLenum = js.native
  
  /* standard DOM */
  val DELETE_STATUS: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_ATTACHMENT: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_BITS: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_BUFFER_BIT: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_CLEAR_VALUE: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_COMPONENT: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_COMPONENT16: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_FUNC: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_RANGE: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_STENCIL: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_STENCIL_ATTACHMENT: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_TEST: GLenum = js.native
  
  /* standard DOM */
  val DEPTH_WRITEMASK: GLenum = js.native
  
  /* standard DOM */
  val DITHER: GLenum = js.native
  
  /* standard DOM */
  val DONT_CARE: GLenum = js.native
  
  /* standard DOM */
  val DST_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val DST_COLOR: GLenum = js.native
  
  /* standard DOM */
  val DYNAMIC_DRAW: GLenum = js.native
  
  /* standard DOM */
  val ELEMENT_ARRAY_BUFFER: GLenum = js.native
  
  /* standard DOM */
  val ELEMENT_ARRAY_BUFFER_BINDING: GLenum = js.native
  
  /* standard DOM */
  val EQUAL: GLenum = js.native
  
  /* standard DOM */
  val FASTEST: GLenum = js.native
  
  /* standard DOM */
  val FLOAT: GLenum = js.native
  
  /* standard DOM */
  val FLOAT_MAT2: GLenum = js.native
  
  /* standard DOM */
  val FLOAT_MAT3: GLenum = js.native
  
  /* standard DOM */
  val FLOAT_MAT4: GLenum = js.native
  
  /* standard DOM */
  val FLOAT_VEC2: GLenum = js.native
  
  /* standard DOM */
  val FLOAT_VEC3: GLenum = js.native
  
  /* standard DOM */
  val FLOAT_VEC4: GLenum = js.native
  
  /* standard DOM */
  val FRAGMENT_SHADER: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_BINDING: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_COMPLETE: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum = js.native
  
  /* standard DOM */
  val FRAMEBUFFER_UNSUPPORTED: GLenum = js.native
  
  /* standard DOM */
  val FRONT: GLenum = js.native
  
  /* standard DOM */
  val FRONT_AND_BACK: GLenum = js.native
  
  /* standard DOM */
  val FRONT_FACE: GLenum = js.native
  
  /* standard DOM */
  val FUNC_ADD: GLenum = js.native
  
  /* standard DOM */
  val FUNC_REVERSE_SUBTRACT: GLenum = js.native
  
  /* standard DOM */
  val FUNC_SUBTRACT: GLenum = js.native
  
  /* standard DOM */
  val GENERATE_MIPMAP_HINT: GLenum = js.native
  
  /* standard DOM */
  val GEQUAL: GLenum = js.native
  
  /* standard DOM */
  val GREATER: GLenum = js.native
  
  /* standard DOM */
  val GREEN_BITS: GLenum = js.native
  
  /* standard DOM */
  val HIGH_FLOAT: GLenum = js.native
  
  /* standard DOM */
  val HIGH_INT: GLenum = js.native
  
  /* standard DOM */
  val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum = js.native
  
  /* standard DOM */
  val IMPLEMENTATION_COLOR_READ_TYPE: GLenum = js.native
  
  /* standard DOM */
  val INCR: GLenum = js.native
  
  /* standard DOM */
  val INCR_WRAP: GLenum = js.native
  
  /* standard DOM */
  val INT: GLenum = js.native
  
  /* standard DOM */
  val INT_VEC2: GLenum = js.native
  
  /* standard DOM */
  val INT_VEC3: GLenum = js.native
  
  /* standard DOM */
  val INT_VEC4: GLenum = js.native
  
  /* standard DOM */
  val INVALID_ENUM: GLenum = js.native
  
  /* standard DOM */
  val INVALID_FRAMEBUFFER_OPERATION: GLenum = js.native
  
  /* standard DOM */
  val INVALID_OPERATION: GLenum = js.native
  
  /* standard DOM */
  val INVALID_VALUE: GLenum = js.native
  
  /* standard DOM */
  val INVERT: GLenum = js.native
  
  /* standard DOM */
  val KEEP: GLenum = js.native
  
  /* standard DOM */
  val LEQUAL: GLenum = js.native
  
  /* standard DOM */
  val LESS: GLenum = js.native
  
  /* standard DOM */
  val LINEAR: GLenum = js.native
  
  /* standard DOM */
  val LINEAR_MIPMAP_LINEAR: GLenum = js.native
  
  /* standard DOM */
  val LINEAR_MIPMAP_NEAREST: GLenum = js.native
  
  /* standard DOM */
  val LINES: GLenum = js.native
  
  /* standard DOM */
  val LINE_LOOP: GLenum = js.native
  
  /* standard DOM */
  val LINE_STRIP: GLenum = js.native
  
  /* standard DOM */
  val LINE_WIDTH: GLenum = js.native
  
  /* standard DOM */
  val LINK_STATUS: GLenum = js.native
  
  /* standard DOM */
  val LOW_FLOAT: GLenum = js.native
  
  /* standard DOM */
  val LOW_INT: GLenum = js.native
  
  /* standard DOM */
  val LUMINANCE: GLenum = js.native
  
  /* standard DOM */
  val LUMINANCE_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum = js.native
  
  /* standard DOM */
  val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum = js.native
  
  /* standard DOM */
  val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum = js.native
  
  /* standard DOM */
  val MAX_RENDERBUFFER_SIZE: GLenum = js.native
  
  /* standard DOM */
  val MAX_TEXTURE_IMAGE_UNITS: GLenum = js.native
  
  /* standard DOM */
  val MAX_TEXTURE_SIZE: GLenum = js.native
  
  /* standard DOM */
  val MAX_VARYING_VECTORS: GLenum = js.native
  
  /* standard DOM */
  val MAX_VERTEX_ATTRIBS: GLenum = js.native
  
  /* standard DOM */
  val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum = js.native
  
  /* standard DOM */
  val MAX_VERTEX_UNIFORM_VECTORS: GLenum = js.native
  
  /* standard DOM */
  val MAX_VIEWPORT_DIMS: GLenum = js.native
  
  /* standard DOM */
  val MEDIUM_FLOAT: GLenum = js.native
  
  /* standard DOM */
  val MEDIUM_INT: GLenum = js.native
  
  /* standard DOM */
  val MIRRORED_REPEAT: GLenum = js.native
  
  /* standard DOM */
  val NEAREST: GLenum = js.native
  
  /* standard DOM */
  val NEAREST_MIPMAP_LINEAR: GLenum = js.native
  
  /* standard DOM */
  val NEAREST_MIPMAP_NEAREST: GLenum = js.native
  
  /* standard DOM */
  val NEVER: GLenum = js.native
  
  /* standard DOM */
  val NICEST: GLenum = js.native
  
  /* standard DOM */
  val NONE: GLenum = js.native
  
  /* standard DOM */
  val NOTEQUAL: GLenum = js.native
  
  /* standard DOM */
  val NO_ERROR: GLenum = js.native
  
  /* standard DOM */
  val ONE: GLenum = js.native
  
  /* standard DOM */
  val ONE_MINUS_CONSTANT_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val ONE_MINUS_CONSTANT_COLOR: GLenum = js.native
  
  /* standard DOM */
  val ONE_MINUS_DST_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val ONE_MINUS_DST_COLOR: GLenum = js.native
  
  /* standard DOM */
  val ONE_MINUS_SRC_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val ONE_MINUS_SRC_COLOR: GLenum = js.native
  
  /* standard DOM */
  val OUT_OF_MEMORY: GLenum = js.native
  
  /* standard DOM */
  val PACK_ALIGNMENT: GLenum = js.native
  
  /* standard DOM */
  val POINTS: GLenum = js.native
  
  /* standard DOM */
  val POLYGON_OFFSET_FACTOR: GLenum = js.native
  
  /* standard DOM */
  val POLYGON_OFFSET_FILL: GLenum = js.native
  
  /* standard DOM */
  val POLYGON_OFFSET_UNITS: GLenum = js.native
  
  /* standard DOM */
  val RED_BITS: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_ALPHA_SIZE: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_BINDING: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_BLUE_SIZE: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_DEPTH_SIZE: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_GREEN_SIZE: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_HEIGHT: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_INTERNAL_FORMAT: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_RED_SIZE: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_STENCIL_SIZE: GLenum = js.native
  
  /* standard DOM */
  val RENDERBUFFER_WIDTH: GLenum = js.native
  
  /* standard DOM */
  val RENDERER: GLenum = js.native
  
  /* standard DOM */
  val REPEAT: GLenum = js.native
  
  /* standard DOM */
  val REPLACE: GLenum = js.native
  
  /* standard DOM */
  val RGB: GLenum = js.native
  
  /* standard DOM */
  val RGB565: GLenum = js.native
  
  /* standard DOM */
  val RGB5_A1: GLenum = js.native
  
  /* standard DOM */
  val RGBA: GLenum = js.native
  
  /* standard DOM */
  val RGBA4: GLenum = js.native
  
  /* standard DOM */
  val SAMPLER_2D: GLenum = js.native
  
  /* standard DOM */
  val SAMPLER_CUBE: GLenum = js.native
  
  /* standard DOM */
  val SAMPLES: GLenum = js.native
  
  /* standard DOM */
  val SAMPLE_ALPHA_TO_COVERAGE: GLenum = js.native
  
  /* standard DOM */
  val SAMPLE_BUFFERS: GLenum = js.native
  
  /* standard DOM */
  val SAMPLE_COVERAGE: GLenum = js.native
  
  /* standard DOM */
  val SAMPLE_COVERAGE_INVERT: GLenum = js.native
  
  /* standard DOM */
  val SAMPLE_COVERAGE_VALUE: GLenum = js.native
  
  /* standard DOM */
  val SCISSOR_BOX: GLenum = js.native
  
  /* standard DOM */
  val SCISSOR_TEST: GLenum = js.native
  
  /* standard DOM */
  val SHADER_TYPE: GLenum = js.native
  
  /* standard DOM */
  val SHADING_LANGUAGE_VERSION: GLenum = js.native
  
  /* standard DOM */
  val SHORT: GLenum = js.native
  
  /* standard DOM */
  val SRC_ALPHA: GLenum = js.native
  
  /* standard DOM */
  val SRC_ALPHA_SATURATE: GLenum = js.native
  
  /* standard DOM */
  val SRC_COLOR: GLenum = js.native
  
  /* standard DOM */
  val STATIC_DRAW: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_ATTACHMENT: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_BACK_FAIL: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_BACK_FUNC: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_BACK_PASS_DEPTH_PASS: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_BACK_REF: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_BACK_VALUE_MASK: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_BACK_WRITEMASK: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_BITS: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_BUFFER_BIT: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_CLEAR_VALUE: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_FAIL: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_FUNC: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_INDEX8: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_PASS_DEPTH_FAIL: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_PASS_DEPTH_PASS: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_REF: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_TEST: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_VALUE_MASK: GLenum = js.native
  
  /* standard DOM */
  val STENCIL_WRITEMASK: GLenum = js.native
  
  /* standard DOM */
  val STREAM_DRAW: GLenum = js.native
  
  /* standard DOM */
  val SUBPIXEL_BITS: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE0: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE1: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE10: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE11: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE12: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE13: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE14: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE15: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE16: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE17: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE18: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE19: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE2: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE20: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE21: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE22: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE23: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE24: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE25: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE26: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE27: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE28: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE29: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE3: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE30: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE31: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE4: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE5: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE6: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE7: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE8: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE9: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_2D: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_BINDING_2D: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_BINDING_CUBE_MAP: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_CUBE_MAP: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_MAG_FILTER: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_MIN_FILTER: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_WRAP_S: GLenum = js.native
  
  /* standard DOM */
  val TEXTURE_WRAP_T: GLenum = js.native
  
  /* standard DOM */
  val TRIANGLES: GLenum = js.native
  
  /* standard DOM */
  val TRIANGLE_FAN: GLenum = js.native
  
  /* standard DOM */
  val TRIANGLE_STRIP: GLenum = js.native
  
  /* standard DOM */
  val UNPACK_ALIGNMENT: GLenum = js.native
  
  /* standard DOM */
  val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum = js.native
  
  /* standard DOM */
  val UNPACK_FLIP_Y_WEBGL: GLenum = js.native
  
  /* standard DOM */
  val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum = js.native
  
  /* standard DOM */
  val UNSIGNED_BYTE: GLenum = js.native
  
  /* standard DOM */
  val UNSIGNED_INT: GLenum = js.native
  
  /* standard DOM */
  val UNSIGNED_SHORT: GLenum = js.native
  
  /* standard DOM */
  val UNSIGNED_SHORT_4_4_4_4: GLenum = js.native
  
  /* standard DOM */
  val UNSIGNED_SHORT_5_5_5_1: GLenum = js.native
  
  /* standard DOM */
  val UNSIGNED_SHORT_5_6_5: GLenum = js.native
  
  /* standard DOM */
  val VALIDATE_STATUS: GLenum = js.native
  
  /* standard DOM */
  val VENDOR: GLenum = js.native
  
  /* standard DOM */
  val VERSION: GLenum = js.native
  
  /* standard DOM */
  val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum = js.native
  
  /* standard DOM */
  val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum = js.native
  
  /* standard DOM */
  val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum = js.native
  
  /* standard DOM */
  val VERTEX_ATTRIB_ARRAY_POINTER: GLenum = js.native
  
  /* standard DOM */
  val VERTEX_ATTRIB_ARRAY_SIZE: GLenum = js.native
  
  /* standard DOM */
  val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum = js.native
  
  /* standard DOM */
  val VERTEX_ATTRIB_ARRAY_TYPE: GLenum = js.native
  
  /* standard DOM */
  val VERTEX_SHADER: GLenum = js.native
  
  /* standard DOM */
  val VIEWPORT: GLenum = js.native
  
  /* standard DOM */
  val ZERO: GLenum = js.native
  
  /* standard DOM */
  def activeTexture(texture: GLenum): Unit = js.native
  
  /* standard DOM */
  def attachShader(program: org.scalajs.dom.WebGLProgram, shader: org.scalajs.dom.WebGLShader): Unit = js.native
  
  /* standard DOM */
  def bindAttribLocation(program: org.scalajs.dom.WebGLProgram, index: GLuint, name: java.lang.String): Unit = js.native
  
  /* standard DOM */
  def bindBuffer(target: GLenum): Unit = js.native
  def bindBuffer(target: GLenum, buffer: org.scalajs.dom.WebGLBuffer): Unit = js.native
  
  /* standard DOM */
  def bindFramebuffer(target: GLenum): Unit = js.native
  def bindFramebuffer(target: GLenum, framebuffer: org.scalajs.dom.WebGLFramebuffer): Unit = js.native
  
  /* standard DOM */
  def bindRenderbuffer(target: GLenum): Unit = js.native
  def bindRenderbuffer(target: GLenum, renderbuffer: org.scalajs.dom.WebGLRenderbuffer): Unit = js.native
  
  /* standard DOM */
  def bindTexture(target: GLenum): Unit = js.native
  def bindTexture(target: GLenum, texture: org.scalajs.dom.WebGLTexture): Unit = js.native
  
  /* standard DOM */
  def blendColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = js.native
  
  /* standard DOM */
  def blendEquation(mode: GLenum): Unit = js.native
  
  /* standard DOM */
  def blendEquationSeparate(modeRGB: GLenum, modeAlpha: GLenum): Unit = js.native
  
  /* standard DOM */
  def blendFunc(sfactor: GLenum, dfactor: GLenum): Unit = js.native
  
  /* standard DOM */
  def blendFuncSeparate(srcRGB: GLenum, dstRGB: GLenum, srcAlpha: GLenum, dstAlpha: GLenum): Unit = js.native
  
  /* standard DOM */
  val canvas: org.scalajs.dom.HTMLCanvasElement = js.native
  
  /* standard DOM */
  def checkFramebufferStatus(target: GLenum): GLenum = js.native
  
  /* standard DOM */
  def clear(mask: GLbitfield): Unit = js.native
  
  /* standard DOM */
  def clearColor(red: GLclampf, green: GLclampf, blue: GLclampf, alpha: GLclampf): Unit = js.native
  
  /* standard DOM */
  def clearDepth(depth: GLclampf): Unit = js.native
  
  /* standard DOM */
  def clearStencil(s: GLint): Unit = js.native
  
  /* standard DOM */
  def colorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean): Unit = js.native
  
  /* standard DOM */
  def compileShader(shader: org.scalajs.dom.WebGLShader): Unit = js.native
  
  /* standard DOM */
  def copyTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint
  ): Unit = js.native
  
  /* standard DOM */
  def copyTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei
  ): Unit = js.native
  
  /* standard DOM */
  def createBuffer(): org.scalajs.dom.WebGLBuffer | Null = js.native
  
  /* standard DOM */
  def createFramebuffer(): org.scalajs.dom.WebGLFramebuffer | Null = js.native
  
  /* standard DOM */
  def createProgram(): org.scalajs.dom.WebGLProgram | Null = js.native
  
  /* standard DOM */
  def createRenderbuffer(): org.scalajs.dom.WebGLRenderbuffer | Null = js.native
  
  /* standard DOM */
  def createShader(`type`: GLenum): org.scalajs.dom.WebGLShader | Null = js.native
  
  /* standard DOM */
  def createTexture(): org.scalajs.dom.WebGLTexture | Null = js.native
  
  /* standard DOM */
  def cullFace(mode: GLenum): Unit = js.native
  
  /* standard DOM */
  def deleteBuffer(): Unit = js.native
  def deleteBuffer(buffer: org.scalajs.dom.WebGLBuffer): Unit = js.native
  
  /* standard DOM */
  def deleteFramebuffer(): Unit = js.native
  def deleteFramebuffer(framebuffer: org.scalajs.dom.WebGLFramebuffer): Unit = js.native
  
  /* standard DOM */
  def deleteProgram(): Unit = js.native
  def deleteProgram(program: org.scalajs.dom.WebGLProgram): Unit = js.native
  
  /* standard DOM */
  def deleteRenderbuffer(): Unit = js.native
  def deleteRenderbuffer(renderbuffer: org.scalajs.dom.WebGLRenderbuffer): Unit = js.native
  
  /* standard DOM */
  def deleteShader(): Unit = js.native
  def deleteShader(shader: org.scalajs.dom.WebGLShader): Unit = js.native
  
  /* standard DOM */
  def deleteTexture(): Unit = js.native
  def deleteTexture(texture: org.scalajs.dom.WebGLTexture): Unit = js.native
  
  /* standard DOM */
  def depthFunc(func: GLenum): Unit = js.native
  
  /* standard DOM */
  def depthMask(flag: GLboolean): Unit = js.native
  
  /* standard DOM */
  def depthRange(zNear: GLclampf, zFar: GLclampf): Unit = js.native
  
  /* standard DOM */
  def detachShader(program: org.scalajs.dom.WebGLProgram, shader: org.scalajs.dom.WebGLShader): Unit = js.native
  
  /* standard DOM */
  def disable(cap: GLenum): Unit = js.native
  
  /* standard DOM */
  def disableVertexAttribArray(index: GLuint): Unit = js.native
  
  /* standard DOM */
  def drawArrays(mode: GLenum, first: GLint, count: GLsizei): Unit = js.native
  
  /* standard DOM */
  def drawElements(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr): Unit = js.native
  
  /* standard DOM */
  val drawingBufferHeight: GLsizei = js.native
  
  /* standard DOM */
  val drawingBufferWidth: GLsizei = js.native
  
  /* standard DOM */
  def enable(cap: GLenum): Unit = js.native
  
  /* standard DOM */
  def enableVertexAttribArray(index: GLuint): Unit = js.native
  
  /* standard DOM */
  def finish(): Unit = js.native
  
  /* standard DOM */
  def flush(): Unit = js.native
  
  /* standard DOM */
  def framebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum): Unit = js.native
  def framebufferRenderbuffer(
    target: GLenum,
    attachment: GLenum,
    renderbuffertarget: GLenum,
    renderbuffer: org.scalajs.dom.WebGLRenderbuffer
  ): Unit = js.native
  
  /* standard DOM */
  def framebufferTexture2D(
    target: GLenum,
    attachment: GLenum,
    textarget: GLenum,
    texture: org.scalajs.dom.WebGLTexture,
    level: GLint
  ): Unit = js.native
  def framebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: Null, level: GLint): Unit = js.native
  
  /* standard DOM */
  def frontFace(mode: GLenum): Unit = js.native
  
  /* standard DOM */
  def generateMipmap(target: GLenum): Unit = js.native
  
  /* standard DOM */
  def getActiveAttrib(program: org.scalajs.dom.WebGLProgram, index: GLuint): org.scalajs.dom.WebGLActiveInfo | Null = js.native
  
  /* standard DOM */
  def getActiveUniform(program: org.scalajs.dom.WebGLProgram, index: GLuint): org.scalajs.dom.WebGLActiveInfo | Null = js.native
  
  /* standard DOM */
  def getAttachedShaders(program: org.scalajs.dom.WebGLProgram): js.Array[org.scalajs.dom.WebGLShader] | Null = js.native
  
  /* standard DOM */
  def getAttribLocation(program: org.scalajs.dom.WebGLProgram, name: java.lang.String): GLint = js.native
  
  /* standard DOM */
  def getBufferParameter(target: GLenum, pname: GLenum): Any = js.native
  
  /* standard DOM */
  def getContextAttributes(): org.scalajs.dom.WebGLContextAttributes | Null = js.native
  
  /* standard DOM */
  def getError(): GLenum = js.native
  
  /* standard DOM */
  def getExtension(name: java.lang.String): Any = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_ANGLEinstancedarrays(extensionName: ANGLE_instanced_arrays): ANGLEInstancedArrays | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_EXTblendminmax(extensionName: EXT_blend_minmax): EXTBlendMinmax | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_EXTcolorbufferfloat(extensionName: EXT_color_buffer_float): EXTColorBufferFloat | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_EXTcolorbufferhalffloat(extensionName: EXT_color_buffer_half_float): EXTColorBufferHalfFloat | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_EXTfloatblend(extensionName: EXT_float_blend): EXTFloatBlend | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_EXTfragdepth(extensionName: EXT_frag_depth): EXTFragDepth | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_EXTsRGB(extensionName: EXT_sRGB): EXTSRGB | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_EXTshadertexturelod(extensionName: EXT_shader_texture_lod): EXTShaderTextureLod | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_EXTtexturefilteranisotropic(extensionName: EXT_texture_filter_anisotropic): EXTTextureFilterAnisotropic | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_KHRparallelshadercompile(extensionName: KHR_parallel_shader_compile): KHRParallelShaderCompile | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_OESelementindexuint(extensionName: OES_element_index_uint): OESElementIndexUint | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_OESstandardderivatives(extensionName: OES_standard_derivatives): OESStandardDerivatives | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_OEStexturefloat(extensionName: OES_texture_float): OESTextureFloat | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_OEStexturefloatlinear(extensionName: OES_texture_float_linear): OESTextureFloatLinear | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_OEStexturehalffloat(extensionName: OES_texture_half_float): OESTextureHalfFloat | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_OEStexturehalffloatlinear(extensionName: OES_texture_half_float_linear): OESTextureHalfFloatLinear | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_OESvertexarrayobject(extensionName: OES_vertex_array_object): OESVertexArrayObject | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_OVRmultiview2(extensionName: OVR_multiview2): OVRMultiview2 | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLcolorbufferfloat(extensionName: WEBGL_color_buffer_float): WEBGLColorBufferFloat | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureastc(extensionName: WEBGL_compressed_texture_astc): WEBGLCompressedTextureAstc | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureetc(extensionName: WEBGL_compressed_texture_etc): WEBGLCompressedTextureEtc | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureetc1(extensionName: WEBGL_compressed_texture_etc1): WEBGLCompressedTextureEtc1 | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextures3tc(extensionName: WEBGL_compressed_texture_s3tc): WEBGLCompressedTextureS3tc | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextures3tcsrgb(extensionName: WEBGL_compressed_texture_s3tc_srgb): WEBGLCompressedTextureS3tcSrgb | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLdebugrendererinfo(extensionName: WEBGL_debug_renderer_info): WEBGLDebugRendererInfo | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLdebugshaders(extensionName: WEBGL_debug_shaders): WEBGLDebugShaders | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLdepthtexture(extensionName: WEBGL_depth_texture): WEBGLDepthTexture | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLdrawbuffers(extensionName: WEBGL_draw_buffers): WEBGLDrawBuffers | Null = js.native
  /* standard DOM */
  @JSName("getExtension")
  def getExtension_WEBGLlosecontext(extensionName: WEBGL_lose_context): WEBGLLoseContext | Null = js.native
  
  /* standard DOM */
  def getFramebufferAttachmentParameter(target: GLenum, attachment: GLenum, pname: GLenum): Any = js.native
  
  /* standard DOM */
  def getParameter(pname: GLenum): Any = js.native
  
  /* standard DOM */
  def getProgramInfoLog(program: org.scalajs.dom.WebGLProgram): java.lang.String | Null = js.native
  
  /* standard DOM */
  def getProgramParameter(program: org.scalajs.dom.WebGLProgram, pname: GLenum): Any = js.native
  
  /* standard DOM */
  def getRenderbufferParameter(target: GLenum, pname: GLenum): Any = js.native
  
  /* standard DOM */
  def getShaderInfoLog(shader: org.scalajs.dom.WebGLShader): java.lang.String | Null = js.native
  
  /* standard DOM */
  def getShaderParameter(shader: org.scalajs.dom.WebGLShader, pname: GLenum): Any = js.native
  
  /* standard DOM */
  def getShaderPrecisionFormat(shadertype: GLenum, precisiontype: GLenum): org.scalajs.dom.WebGLShaderPrecisionFormat | Null = js.native
  
  /* standard DOM */
  def getShaderSource(shader: org.scalajs.dom.WebGLShader): java.lang.String | Null = js.native
  
  /* standard DOM */
  def getSupportedExtensions(): js.Array[java.lang.String] | Null = js.native
  
  /* standard DOM */
  def getTexParameter(target: GLenum, pname: GLenum): Any = js.native
  
  /* standard DOM */
  def getUniform(program: org.scalajs.dom.WebGLProgram, location: org.scalajs.dom.WebGLUniformLocation): Any = js.native
  
  /* standard DOM */
  def getUniformLocation(program: org.scalajs.dom.WebGLProgram, name: java.lang.String): org.scalajs.dom.WebGLUniformLocation | Null = js.native
  
  /* standard DOM */
  def getVertexAttrib(index: GLuint, pname: GLenum): Any = js.native
  
  /* standard DOM */
  def getVertexAttribOffset(index: GLuint, pname: GLenum): GLintptr = js.native
  
  /* standard DOM */
  def hint(target: GLenum, mode: GLenum): Unit = js.native
  
  /* standard DOM */
  def isBuffer(): GLboolean = js.native
  def isBuffer(buffer: org.scalajs.dom.WebGLBuffer): GLboolean = js.native
  
  /* standard DOM */
  def isContextLost(): scala.Boolean = js.native
  
  /* standard DOM */
  def isEnabled(cap: GLenum): GLboolean = js.native
  
  /* standard DOM */
  def isFramebuffer(): GLboolean = js.native
  def isFramebuffer(framebuffer: org.scalajs.dom.WebGLFramebuffer): GLboolean = js.native
  
  /* standard DOM */
  def isProgram(): GLboolean = js.native
  def isProgram(program: org.scalajs.dom.WebGLProgram): GLboolean = js.native
  
  /* standard DOM */
  def isRenderbuffer(): GLboolean = js.native
  def isRenderbuffer(renderbuffer: org.scalajs.dom.WebGLRenderbuffer): GLboolean = js.native
  
  /* standard DOM */
  def isShader(): GLboolean = js.native
  def isShader(shader: org.scalajs.dom.WebGLShader): GLboolean = js.native
  
  /* standard DOM */
  def isTexture(): GLboolean = js.native
  def isTexture(texture: org.scalajs.dom.WebGLTexture): GLboolean = js.native
  
  /* standard DOM */
  def lineWidth(width: GLfloat): Unit = js.native
  
  /* standard DOM */
  def linkProgram(program: org.scalajs.dom.WebGLProgram): Unit = js.native
  
  def pixelStorei(pname: GLenum, param: GLboolean): Unit = js.native
  /* standard DOM */
  def pixelStorei(pname: GLenum, param: GLint): Unit = js.native
  
  /* standard DOM */
  def polygonOffset(factor: GLfloat, units: GLfloat): Unit = js.native
  
  /* standard DOM */
  def renderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit = js.native
  
  /* standard DOM */
  def sampleCoverage(value: GLclampf, invert: GLboolean): Unit = js.native
  
  /* standard DOM */
  def scissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = js.native
  
  /* standard DOM */
  def shaderSource(shader: org.scalajs.dom.WebGLShader, source: java.lang.String): Unit = js.native
  
  /* standard DOM */
  def stencilFunc(func: GLenum, ref: GLint, mask: GLuint): Unit = js.native
  
  /* standard DOM */
  def stencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint): Unit = js.native
  
  /* standard DOM */
  def stencilMask(mask: GLuint): Unit = js.native
  
  /* standard DOM */
  def stencilMaskSeparate(face: GLenum, mask: GLuint): Unit = js.native
  
  /* standard DOM */
  def stencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum): Unit = js.native
  
  /* standard DOM */
  def stencilOpSeparate(face: GLenum, fail: GLenum, zfail: GLenum, zpass: GLenum): Unit = js.native
  
  /* standard DOM */
  def texParameterf(target: GLenum, pname: GLenum, param: GLfloat): Unit = js.native
  
  /* standard DOM */
  def texParameteri(target: GLenum, pname: GLenum, param: GLint): Unit = js.native
  
  /* standard DOM */
  def uniform1f(location: org.scalajs.dom.WebGLUniformLocation, x: GLfloat): Unit = js.native
  def uniform1f(location: Null, x: GLfloat): Unit = js.native
  
  /* standard DOM */
  def uniform1i(location: org.scalajs.dom.WebGLUniformLocation, x: GLint): Unit = js.native
  def uniform1i(location: Null, x: GLint): Unit = js.native
  
  /* standard DOM */
  def uniform2f(location: org.scalajs.dom.WebGLUniformLocation, x: GLfloat, y: GLfloat): Unit = js.native
  def uniform2f(location: Null, x: GLfloat, y: GLfloat): Unit = js.native
  
  /* standard DOM */
  def uniform2i(location: org.scalajs.dom.WebGLUniformLocation, x: GLint, y: GLint): Unit = js.native
  def uniform2i(location: Null, x: GLint, y: GLint): Unit = js.native
  
  /* standard DOM */
  def uniform3f(location: org.scalajs.dom.WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat): Unit = js.native
  def uniform3f(location: Null, x: GLfloat, y: GLfloat, z: GLfloat): Unit = js.native
  
  /* standard DOM */
  def uniform3i(location: org.scalajs.dom.WebGLUniformLocation, x: GLint, y: GLint, z: GLint): Unit = js.native
  def uniform3i(location: Null, x: GLint, y: GLint, z: GLint): Unit = js.native
  
  /* standard DOM */
  def uniform4f(location: org.scalajs.dom.WebGLUniformLocation, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = js.native
  def uniform4f(location: Null, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = js.native
  
  /* standard DOM */
  def uniform4i(location: org.scalajs.dom.WebGLUniformLocation, x: GLint, y: GLint, z: GLint, w: GLint): Unit = js.native
  def uniform4i(location: Null, x: GLint, y: GLint, z: GLint, w: GLint): Unit = js.native
  
  /* standard DOM */
  def useProgram(): Unit = js.native
  def useProgram(program: org.scalajs.dom.WebGLProgram): Unit = js.native
  
  /* standard DOM */
  def validateProgram(program: org.scalajs.dom.WebGLProgram): Unit = js.native
  
  /* standard DOM */
  def vertexAttrib1f(index: GLuint, x: GLfloat): Unit = js.native
  
  /* standard DOM.Iterable */
  /* standard DOM */
  def vertexAttrib1fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = js.native
  
  /* standard DOM */
  def vertexAttrib2f(index: GLuint, x: GLfloat, y: GLfloat): Unit = js.native
  
  /* standard DOM.Iterable */
  /* standard DOM */
  def vertexAttrib2fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = js.native
  
  /* standard DOM */
  def vertexAttrib3f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat): Unit = js.native
  
  /* standard DOM.Iterable */
  /* standard DOM */
  def vertexAttrib3fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = js.native
  
  /* standard DOM */
  def vertexAttrib4f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit = js.native
  
  /* standard DOM.Iterable */
  /* standard DOM */
  def vertexAttrib4fv(index: GLuint, values: Float32List | js.Iterable[GLfloat]): Unit = js.native
  
  /* standard DOM */
  def vertexAttribPointer(
    index: GLuint,
    size: GLint,
    `type`: GLenum,
    normalized: GLboolean,
    stride: GLsizei,
    offset: GLintptr
  ): Unit = js.native
  
  /* standard DOM */
  def viewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit = js.native
}

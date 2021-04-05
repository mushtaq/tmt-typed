package tmttyped.node

import tmttyped.node.querystringMod.ParseOptions
import tmttyped.node.querystringMod.ParsedUrlQuery
import tmttyped.node.querystringMod.ParsedUrlQueryInput
import tmttyped.node.querystringMod.StringifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeQuerystringMod {
  
  @JSImport("node:querystring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof parse` */
  @scala.inline
  def decode(str: java.lang.String): ParsedUrlQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(
    str: java.lang.String,
    sep: js.UndefOr[scala.Nothing],
    eq: js.UndefOr[scala.Nothing],
    options: ParseOptions
  ): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: js.UndefOr[scala.Nothing], eq: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: js.UndefOr[scala.Nothing], eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: java.lang.String, eq: js.UndefOr[scala.Nothing], options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: java.lang.String, eq: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def decode(str: java.lang.String, sep: java.lang.String, eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  
  /* was `typeof stringify` */
  @scala.inline
  def encode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")().asInstanceOf[java.lang.String]
  @scala.inline
  def encode(
    obj: js.UndefOr[scala.Nothing],
    sep: js.UndefOr[scala.Nothing],
    eq: js.UndefOr[scala.Nothing],
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: js.UndefOr[scala.Nothing], sep: js.UndefOr[scala.Nothing], eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(
    obj: js.UndefOr[scala.Nothing],
    sep: js.UndefOr[scala.Nothing],
    eq: java.lang.String,
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: js.UndefOr[scala.Nothing], sep: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(
    obj: js.UndefOr[scala.Nothing],
    sep: java.lang.String,
    eq: js.UndefOr[scala.Nothing],
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: js.UndefOr[scala.Nothing], sep: java.lang.String, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(
    obj: js.UndefOr[scala.Nothing],
    sep: java.lang.String,
    eq: java.lang.String,
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(
    obj: ParsedUrlQueryInput,
    sep: js.UndefOr[scala.Nothing],
    eq: js.UndefOr[scala.Nothing],
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: js.UndefOr[scala.Nothing], eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(
    obj: ParsedUrlQueryInput,
    sep: js.UndefOr[scala.Nothing],
    eq: java.lang.String,
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(
    obj: ParsedUrlQueryInput,
    sep: java.lang.String,
    eq: js.UndefOr[scala.Nothing],
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def encode(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def escape(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def parse(str: java.lang.String): ParsedUrlQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(
    str: java.lang.String,
    sep: js.UndefOr[scala.Nothing],
    eq: js.UndefOr[scala.Nothing],
    options: ParseOptions
  ): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: js.UndefOr[scala.Nothing], eq: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: js.UndefOr[scala.Nothing], eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: java.lang.String, eq: js.UndefOr[scala.Nothing], options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  @scala.inline
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String, options: ParseOptions): ParsedUrlQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrlQuery]
  
  @scala.inline
  def stringify(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(
    obj: js.UndefOr[scala.Nothing],
    sep: js.UndefOr[scala.Nothing],
    eq: js.UndefOr[scala.Nothing],
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: js.UndefOr[scala.Nothing], sep: js.UndefOr[scala.Nothing], eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(
    obj: js.UndefOr[scala.Nothing],
    sep: js.UndefOr[scala.Nothing],
    eq: java.lang.String,
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: js.UndefOr[scala.Nothing], sep: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(
    obj: js.UndefOr[scala.Nothing],
    sep: java.lang.String,
    eq: js.UndefOr[scala.Nothing],
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: js.UndefOr[scala.Nothing], sep: java.lang.String, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(
    obj: js.UndefOr[scala.Nothing],
    sep: java.lang.String,
    eq: java.lang.String,
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(
    obj: ParsedUrlQueryInput,
    sep: js.UndefOr[scala.Nothing],
    eq: js.UndefOr[scala.Nothing],
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: js.UndefOr[scala.Nothing], eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(
    obj: ParsedUrlQueryInput,
    sep: js.UndefOr[scala.Nothing],
    eq: java.lang.String,
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(
    obj: ParsedUrlQueryInput,
    sep: java.lang.String,
    eq: js.UndefOr[scala.Nothing],
    options: StringifyOptions
  ): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def stringify(obj: ParsedUrlQueryInput, sep: java.lang.String, eq: java.lang.String, options: StringifyOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], eq.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def unescape(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}

package com.toocol.plugin.tooltip.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum EscapeColor256Mode implements IEscapeMode {
    C_0(0, "#000000", "0 0 0"),
    C_1(1, "#800000", "128 0 0"),
    C_2(2, "#008000", "0 128 0"),
    C_3(3, "#808000", "128 128 0"),
    C_4(4, "#000080", "0 0 128"),
    C_5(5, "#800080", "128 0 128"),
    C_6(6, "#008080", "0 128 128"),
    C_7(7, "#c0c0c0", "192 192 192"),
    C_8(8, "#808080", "128 128 128"),
    C_9(9, "#ff0000", "255 0 0"),
    C_10(10, "#00ff00", "0 255 0"),
    C_11(11, "#ffff00", "255 255 0"),
    C_12(12, "#0000ff", "0 0 255"),
    C_13(13, "#ff00ff", "255 0 255"),
    C_14(14, "#00ffff", "0 255 255"),
    C_15(15, "#ffffff", "255 255 255"),
    C_16(16, "#000000", "0 0 0"),
    C_17(17, "#00005f", "0 0 95"),
    C_18(18, "#000087", "0 0 135"),
    C_19(19, "#0000af", "0 0 175"),
    C_20(20, "#0000d7", "0 0 215"),
    C_21(21, "#0000ff", "0 0 255"),
    C_22(22, "#005f00", "0 95 0"),
    C_23(23, "#005f5f", "0 95 95"),
    C_24(24, "#005f87", "0 95 135"),
    C_25(25, "#005faf", "0 95 175"),
    C_26(26, "#005fd7", "0 95 215"),
    C_27(27, "#005fff", "0 95 255"),
    C_28(28, "#008700", "0 135 0"),
    C_29(29, "#00875f", "0 135 95"),
    C_30(30, "#008787", "0 135 135"),
    C_31(31, "#0087af", "0 135 175"),
    C_32(32, "#0087d7", "0 135 215"),
    C_33(33, "#0087ff", "0 135 255"),
    C_34(34, "#00af00", "0 175 0"),
    C_35(35, "#00af5f", "0 175 95"),
    C_36(36, "#00af87", "0 175 135"),
    C_37(37, "#00afaf", "0 175 175"),
    C_38(38, "#00afd7", "0 175 215"),
    C_39(39, "#00afff", "0 175 255"),
    C_40(40, "#00d700", "0 215 0"),
    C_41(41, "#00d75f", "0 215 95"),
    C_42(42, "#00d787", "0 215 135"),
    C_43(43, "#00d7af", "0 215 175"),
    C_44(44, "#00d7d7", "0 215 215"),
    C_45(45, "#00d7ff", "0 215 255"),
    C_46(46, "#00ff00", "0 255 0"),
    C_47(47, "#00ff5f", "0 255 95"),
    C_48(48, "#00ff87", "0 255 135"),
    C_49(49, "#00ffaf", "0 255 175"),
    C_50(50, "#00ffd7", "0 255 215"),
    C_51(51, "#00ffff", "0 255 255"),
    C_52(52, "#5f0000", "95 0 0"),
    C_53(53, "#5f005f", "95 0 95"),
    C_54(54, "#5f0087", "95 0 135"),
    C_55(55, "#5f00af", "95 0 175"),
    C_56(56, "#5f00d7", "95 0 215"),
    C_57(57, "#5f00ff", "95 0 255"),
    C_58(58, "#5f5f00", "95 95 0"),
    C_59(59, "#5f5f5f", "95 95 95"),
    C_60(60, "#5f5f87", "95 95 135"),
    C_61(61, "#5f5faf", "95 95 175"),
    C_62(62, "#5f5fd7", "95 95 215"),
    C_63(63, "#5f5fff", "95 95 255"),
    C_64(64, "#5f8700", "95 135 0"),
    C_65(65, "#5f875f", "95 135 95"),
    C_66(66, "#5f8787", "95 135 135"),
    C_67(67, "#5f87af", "95 135 175"),
    C_68(68, "#5f87d7", "95 135 215"),
    C_69(69, "#5f87ff", "95 135 255"),
    C_70(70, "#5faf00", "95 175 0"),
    C_71(71, "#5faf5f", "95 175 95"),
    C_72(72, "#5faf87", "95 175 135"),
    C_73(73, "#5fafaf", "95 175 175"),
    C_74(74, "#5fafd7", "95 175 215"),
    C_75(75, "#5fafff", "95 175 255"),
    C_76(76, "#5fd700", "95 215 0"),
    C_77(77, "#5fd75f", "95 215 95"),
    C_78(78, "#5fd787", "95 215 135"),
    C_79(79, "#5fd7af", "95 215 175"),
    C_80(80, "#5fd7d7", "95 215 215"),
    C_81(81, "#5fd7ff", "95 215 255"),
    C_82(82, "#5fff00", "95 255 0"),
    C_83(83, "#5fff5f", "95 255 95"),
    C_84(84, "#5fff87", "95 255 135"),
    C_85(85, "#5fffaf", "95 255 175"),
    C_86(86, "#5fffd7", "95 255 215"),
    C_87(87, "#5fffff", "95 255 255"),
    C_88(88, "#870000", "135 0 0"),
    C_89(89, "#87005f", "135 0 95"),
    C_90(90, "#870087", "135 0 135"),
    C_91(91, "#8700af", "135 0 175"),
    C_92(92, "#8700d7", "135 0 215"),
    C_93(93, "#8700ff", "135 0 255"),
    C_94(94, "#875f00", "135 95 0"),
    C_95(95, "#875f5f", "135 95 95"),
    C_96(96, "#875f87", "135 95 135"),
    C_97(97, "#875faf", "135 95 175"),
    C_98(98, "#875fd7", "135 95 215"),
    C_99(99, "#875fff", "135 95 255"),
    C_100(100, "#878700", "135 135 0"),
    C_101(101, "#87875f", "135 135 95"),
    C_102(102, "#878787", "135 135 135"),
    C_103(103, "#8787af", "135 135 175"),
    C_104(104, "#8787d7", "135 135 215"),
    C_105(105, "#8787ff", "135 135 255"),
    C_106(106, "#87af00", "135 175 0"),
    C_107(107, "#87af5f", "135 175 95"),
    C_108(108, "#87af87", "135 175 135"),
    C_109(109, "#87afaf", "135 175 175"),
    C_110(110, "#87afd7", "135 175 215"),
    C_111(111, "#87afff", "135 175 255"),
    C_112(112, "#87d700", "135 215 0"),
    C_113(113, "#87d75f", "135 215 95"),
    C_114(114, "#87d787", "135 215 135"),
    C_115(115, "#87d7af", "135 215 175"),
    C_116(116, "#87d7d7", "135 215 215"),
    C_117(117, "#87d7ff", "135 215 255"),
    C_118(118, "#87ff00", "135 255 0"),
    C_119(119, "#87ff5f", "135 255 95"),
    C_120(120, "#87ff87", "135 255 135"),
    C_121(121, "#87ffaf", "135 255 175"),
    C_122(122, "#87ffd7", "135 255 215"),
    C_123(123, "#87ffff", "135 255 255"),
    C_124(124, "#af0000", "175 0 0"),
    C_125(125, "#af005f", "175 0 95"),
    C_126(126, "#af0087", "175 0 135"),
    C_127(127, "#af00af", "175 0 175"),
    C_128(128, "#af00d7", "175 0 215"),
    C_129(129, "#af00ff", "175 0 255"),
    C_130(130, "#af5f00", "175 95 0"),
    C_131(131, "#af5f5f", "175 95 95"),
    C_132(132, "#af5f87", "175 95 135"),
    C_133(133, "#af5faf", "175 95 175"),
    C_134(134, "#af5fd7", "175 95 215"),
    C_135(135, "#af5fff", "175 95 255"),
    C_136(136, "#af8700", "175 135 0"),
    C_137(137, "#af875f", "175 135 95"),
    C_138(138, "#af8787", "175 135 135"),
    C_139(139, "#af87af", "175 135 175"),
    C_140(140, "#af87d7", "175 135 215"),
    C_141(141, "#af87ff", "175 135 255"),
    C_142(142, "#afaf00", "175 175 0"),
    C_143(143, "#afaf5f", "175 175 95"),
    C_144(144, "#afaf87", "175 175 135"),
    C_145(145, "#afafaf", "175 175 175"),
    C_146(146, "#afafd7", "175 175 215"),
    C_147(147, "#afafff", "175 175 255"),
    C_148(148, "#afd700", "175 215 0"),
    C_149(149, "#afd75f", "175 215 95"),
    C_150(150, "#afd787", "175 215 135"),
    C_151(151, "#afd7af", "175 215 175"),
    C_152(152, "#afd7d7", "175 215 215"),
    C_153(153, "#afd7ff", "175 215 255"),
    C_154(154, "#afff00", "175 255 0"),
    C_155(155, "#afff5f", "175 255 95"),
    C_156(156, "#afff87", "175 255 135"),
    C_157(157, "#afffaf", "175 255 175"),
    C_158(158, "#afffd7", "175 255 215"),
    C_159(159, "#afffff", "175 255 255"),
    C_160(160, "#d70000", "215 0 0"),
    C_161(161, "#d7005f", "215 0 95"),
    C_162(162, "#d70087", "215 0 135"),
    C_163(163, "#d700af", "215 0 175"),
    C_164(164, "#d700d7", "215 0 215"),
    C_165(165, "#d700ff", "215 0 255"),
    C_166(166, "#d75f00", "215 95 0"),
    C_167(167, "#d75f5f", "215 95 95"),
    C_168(168, "#d75f87", "215 95 135"),
    C_169(169, "#d75faf", "215 95 175"),
    C_170(170, "#d75fd7", "215 95 215"),
    C_171(171, "#d75fff", "215 95 255"),
    C_172(172, "#d78700", "215 135 0"),
    C_173(173, "#d7875f", "215 135 95"),
    C_174(174, "#d78787", "215 135 135"),
    C_175(175, "#d787af", "215 135 175"),
    C_176(176, "#d787d7", "215 135 215"),
    C_177(177, "#d787ff", "215 135 255"),
    C_178(178, "#d7af00", "215 175 0"),
    C_179(179, "#d7af5f", "215 175 95"),
    C_180(180, "#d7af87", "215 175 135"),
    C_181(181, "#d7afaf", "215 175 175"),
    C_182(182, "#d7afd7", "215 175 215"),
    C_183(183, "#d7afff", "215 175 255"),
    C_184(184, "#d7d700", "215 215 0"),
    C_185(185, "#d7d75f", "215 215 95"),
    C_186(186, "#d7d787", "215 215 135"),
    C_187(187, "#d7d7af", "215 215 175"),
    C_188(188, "#d7d7d7", "215 215 215"),
    C_189(189, "#d7d7ff", "215 215 255"),
    C_190(190, "#d7ff00", "215 255 0"),
    C_191(191, "#d7ff5f", "215 255 95"),
    C_192(192, "#d7ff87", "215 255 135"),
    C_193(193, "#d7ffaf", "215 255 175"),
    C_194(194, "#d7ffd7", "215 255 215"),
    C_195(195, "#d7ffff", "215 255 255"),
    C_196(196, "#ff0000", "255 0 0"),
    C_197(197, "#ff005f", "255 0 95"),
    C_198(198, "#ff0087", "255 0 135"),
    C_199(199, "#ff00af", "255 0 175"),
    C_200(200, "#ff00d7", "255 0 215"),
    C_201(201, "#ff00ff", "255 0 255"),
    C_202(202, "#ff5f00", "255 95 0"),
    C_203(203, "#ff5f5f", "255 95 95"),
    C_204(204, "#ff5f87", "255 95 135"),
    C_205(205, "#ff5faf", "255 95 175"),
    C_206(206, "#ff5fd7", "255 95 215"),
    C_207(207, "#ff5fff", "255 95 255"),
    C_208(208, "#ff8700", "255 135 0"),
    C_209(209, "#ff875f", "255 135 95"),
    C_210(210, "#ff8787", "255 135 135"),
    C_211(211, "#ff87af", "255 135 175"),
    C_212(212, "#ff87d7", "255 135 215"),
    C_213(213, "#ff87ff", "255 135 255"),
    C_214(214, "#ffaf00", "255 175 0"),
    C_215(215, "#ffaf5f", "255 175 95"),
    C_216(216, "#ffaf87", "255 175 135"),
    C_217(217, "#ffafaf", "255 175 175"),
    C_218(218, "#ffafd7", "255 175 215"),
    C_219(219, "#ffafff", "255 175 255"),
    C_220(220, "#ffd700", "255 215 0"),
    C_221(221, "#ffd75f", "255 215 95"),
    C_222(222, "#ffd787", "255 215 135"),
    C_223(223, "#ffd7af", "255 215 175"),
    C_224(224, "#ffd7d7", "255 215 215"),
    C_225(225, "#ffd7ff", "255 215 255"),
    C_226(226, "#ffff00", "255 255 0"),
    C_227(227, "#ffff5f", "255 255 95"),
    C_228(228, "#ffff87", "255 255 135"),
    C_229(229, "#ffffaf", "255 255 175"),
    C_230(230, "#ffffd7", "255 255 215"),
    C_231(231, "#ffffff", "255 255 255"),
    C_232(232, "#080808", "8 8 8"),
    C_233(233, "#121212", "18 18 18"),
    C_234(234, "#1c1c1c", "28 28 28"),
    C_235(235, "#262626", "38 38 38"),
    C_236(236, "#303030", "48 48 48"),
    C_237(237, "#3a3a3a", "58 58 58"),
    C_238(238, "#444444", "68 68 68"),
    C_239(239, "#4e4e4e", "78 78 78"),
    C_240(240, "#585858", "88 88 88"),
    C_241(241, "#626262", "98 98 98"),
    C_242(242, "#6c6c6c", "108 108 108"),
    C_243(243, "#767676", "118 118 118"),
    C_244(244, "#808080", "128 128 128"),
    C_245(245, "#8a8a8a", "138 138 138"),
    C_246(246, "#949494", "148 148 148"),
    C_247(247, "#9e9e9e", "158 158 158"),
    C_248(248, "#a8a8a8", "168 168 168"),
    C_249(249, "#b2b2b2", "178 178 178"),
    C_250(250, "#bcbcbc", "188 188 188"),
    C_251(251, "#c6c6c6", "198 198 198"),
    C_252(252, "#d0d0d0", "208 208 208"),
    C_253(253, "#dadada", "218 218 218"),
    C_254(254, "#e4e4e4", "228 228 228"),
    C_255(255, "#eeeeee", "238 238 238"),
    ;
    private static final Map<Integer, String> colorHexMap = new HashMap<>();
    private static final Map<Integer, String> colorRgbMap = new HashMap<>();

    static {
        for (EscapeColor256Mode color : values()) {
            colorHexMap.put(color.colorCode, color.hexCode);
            colorRgbMap.put(color.colorCode, color.rgb);
        }
    }

    public final int colorCode;
    public final String hexCode;
    public final String rgb;

    private boolean foreground = false;

    EscapeColor256Mode(int colorCode, String hexCode, String rgb) {
        this.colorCode = colorCode;
        this.hexCode = hexCode;
        this.rgb = rgb;
    }

    public EscapeColor256Mode setForeground(boolean foreground) {
        this.foreground = foreground;
        return this;
    }

    public static Optional<EscapeColor256Mode> codeOf(int code) {
        for (EscapeColor256Mode mode : values()) {
            if (mode.colorCode == code) {
                return Optional.of(mode);
            }
        }
        return Optional.empty();
    }

    public static String hexOf(int colorCode) {
        return colorHexMap.get(colorCode);
    }

    public static String rgbOf(int colorCode) {
        return colorRgbMap.get(colorCode);
    }

    @Override
    public String desc() {
        return String.format("ESC[%d;5;%dm\n" +
                        "Set <b>%s</b> color to <b>%d</b>, hexCode=<b>%s</b>, rgb=<b>%s</b>.",
                foreground ? 38 : 48, colorCode, foreground ? "foreground" : "background", colorCode, hexCode, rgb
        );
    }
}

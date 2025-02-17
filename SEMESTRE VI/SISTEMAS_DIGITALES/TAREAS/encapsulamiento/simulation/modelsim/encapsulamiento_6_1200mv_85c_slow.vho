-- Copyright (C) 1991-2013 Altera Corporation
-- Your use of Altera Corporation's design tools, logic functions 
-- and other software and tools, and its AMPP partner logic 
-- functions, and any output files from any of the foregoing 
-- (including device programming or simulation files), and any 
-- associated documentation or information are expressly subject 
-- to the terms and conditions of the Altera Program License 
-- Subscription Agreement, Altera MegaCore Function License 
-- Agreement, or other applicable license agreement, including, 
-- without limitation, that your use is for the sole purpose of 
-- programming logic devices manufactured by Altera and sold by 
-- Altera or its authorized distributors.  Please refer to the 
-- applicable agreement for further details.

-- VENDOR "Altera"
-- PROGRAM "Quartus II 64-Bit"
-- VERSION "Version 13.0.1 Build 232 06/12/2013 Service Pack 1 SJ Web Edition"

-- DATE "02/16/2025 23:34:16"

-- 
-- Device: Altera EP3C16F484C6 Package FBGA484
-- 

-- 
-- This VHDL file should be used for ModelSim-Altera (VHDL) only
-- 

LIBRARY CYCLONEIII;
LIBRARY IEEE;
USE CYCLONEIII.CYCLONEIII_COMPONENTS.ALL;
USE IEEE.STD_LOGIC_1164.ALL;

ENTITY 	compuertas IS
    PORT (
	\-A\ : OUT std_logic;
	A : IN std_logic;
	B : IN std_logic;
	\-B\ : OUT std_logic;
	AB : OUT std_logic;
	AorB : OUT std_logic
	);
END compuertas;

-- Design Ports Information
-- -A	=>  Location: PIN_E7,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- -B	=>  Location: PIN_E4,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- AB	=>  Location: PIN_B1,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- AorB	=>  Location: PIN_B2,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- A	=>  Location: PIN_C3,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- B	=>  Location: PIN_C1,	 I/O Standard: 2.5 V,	 Current Strength: Default


ARCHITECTURE structure OF compuertas IS
SIGNAL gnd : std_logic := '0';
SIGNAL vcc : std_logic := '1';
SIGNAL unknown : std_logic := 'X';
SIGNAL devoe : std_logic := '1';
SIGNAL devclrn : std_logic := '1';
SIGNAL devpor : std_logic := '1';
SIGNAL ww_devoe : std_logic;
SIGNAL ww_devclrn : std_logic;
SIGNAL ww_devpor : std_logic;
SIGNAL \ww_-A\ : std_logic;
SIGNAL ww_A : std_logic;
SIGNAL ww_B : std_logic;
SIGNAL \ww_-B\ : std_logic;
SIGNAL ww_AB : std_logic;
SIGNAL ww_AorB : std_logic;
SIGNAL \-A~output_o\ : std_logic;
SIGNAL \-B~output_o\ : std_logic;
SIGNAL \AB~output_o\ : std_logic;
SIGNAL \AorB~output_o\ : std_logic;
SIGNAL \A~input_o\ : std_logic;
SIGNAL \B~input_o\ : std_logic;
SIGNAL \inst2~combout\ : std_logic;
SIGNAL \inst3~combout\ : std_logic;
SIGNAL \ALT_INV_B~input_o\ : std_logic;
SIGNAL \ALT_INV_A~input_o\ : std_logic;

BEGIN

\-A\ <= \ww_-A\;
ww_A <= A;
ww_B <= B;
\-B\ <= \ww_-B\;
AB <= ww_AB;
AorB <= ww_AorB;
ww_devoe <= devoe;
ww_devclrn <= devclrn;
ww_devpor <= devpor;
\ALT_INV_B~input_o\ <= NOT \B~input_o\;
\ALT_INV_A~input_o\ <= NOT \A~input_o\;

-- Location: IOOBUF_X3_Y29_N23
\-A~output\ : cycloneiii_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \ALT_INV_A~input_o\,
	devoe => ww_devoe,
	o => \-A~output_o\);

-- Location: IOOBUF_X0_Y26_N2
\-B~output\ : cycloneiii_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \ALT_INV_B~input_o\,
	devoe => ww_devoe,
	o => \-B~output_o\);

-- Location: IOOBUF_X0_Y27_N16
\AB~output\ : cycloneiii_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst2~combout\,
	devoe => ww_devoe,
	o => \AB~output_o\);

-- Location: IOOBUF_X0_Y27_N9
\AorB~output\ : cycloneiii_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst3~combout\,
	devoe => ww_devoe,
	o => \AorB~output_o\);

-- Location: IOIBUF_X3_Y29_N29
\A~input\ : cycloneiii_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_A,
	o => \A~input_o\);

-- Location: IOIBUF_X0_Y26_N22
\B~input\ : cycloneiii_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_B,
	o => \B~input_o\);

-- Location: LCCOMB_X1_Y27_N16
inst2 : cycloneiii_lcell_comb
-- Equation(s):
-- \inst2~combout\ = (\A~input_o\ & \B~input_o\)

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1111000000000000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	datac => \A~input_o\,
	datad => \B~input_o\,
	combout => \inst2~combout\);

-- Location: LCCOMB_X1_Y27_N2
inst3 : cycloneiii_lcell_comb
-- Equation(s):
-- \inst3~combout\ = (\A~input_o\) # (\B~input_o\)

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1111111111110000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	datac => \A~input_o\,
	datad => \B~input_o\,
	combout => \inst3~combout\);

\ww_-A\ <= \-A~output_o\;

\ww_-B\ <= \-B~output_o\;

ww_AB <= \AB~output_o\;

ww_AorB <= \AorB~output_o\;
END structure;



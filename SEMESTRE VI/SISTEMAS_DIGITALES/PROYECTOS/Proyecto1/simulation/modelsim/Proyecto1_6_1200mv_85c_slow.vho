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
-- PROGRAM "Quartus II 32-bit"
-- VERSION "Version 13.1.0 Build 162 10/23/2013 SJ Web Edition"

-- DATE "02/07/2025 09:47:53"

-- 
-- Device: Altera EP3C5F256C6 Package FBGA256
-- 

-- 
-- This VHDL file should be used for ModelSim-Altera (VHDL) only
-- 

LIBRARY CYCLONEIII;
LIBRARY IEEE;
USE CYCLONEIII.CYCLONEIII_COMPONENTS.ALL;
USE IEEE.STD_LOGIC_1164.ALL;

ENTITY 	Proyecto1 IS
    PORT (
	pin_name3 : OUT std_logic;
	pin_name1 : IN std_logic;
	pin_name2 : IN std_logic
	);
END Proyecto1;

-- Design Ports Information
-- pin_name3	=>  Location: PIN_L4,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- pin_name1	=>  Location: PIN_T4,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- pin_name2	=>  Location: PIN_P2,	 I/O Standard: 2.5 V,	 Current Strength: Default


ARCHITECTURE structure OF Proyecto1 IS
SIGNAL gnd : std_logic := '0';
SIGNAL vcc : std_logic := '1';
SIGNAL unknown : std_logic := 'X';
SIGNAL devoe : std_logic := '1';
SIGNAL devclrn : std_logic := '1';
SIGNAL devpor : std_logic := '1';
SIGNAL ww_devoe : std_logic;
SIGNAL ww_devclrn : std_logic;
SIGNAL ww_devpor : std_logic;
SIGNAL ww_pin_name3 : std_logic;
SIGNAL ww_pin_name1 : std_logic;
SIGNAL ww_pin_name2 : std_logic;
SIGNAL \pin_name3~output_o\ : std_logic;
SIGNAL \pin_name2~input_o\ : std_logic;
SIGNAL \pin_name1~input_o\ : std_logic;
SIGNAL \inst~combout\ : std_logic;

BEGIN

pin_name3 <= ww_pin_name3;
ww_pin_name1 <= pin_name1;
ww_pin_name2 <= pin_name2;
ww_devoe <= devoe;
ww_devclrn <= devclrn;
ww_devpor <= devpor;

-- Location: IOOBUF_X0_Y6_N23
\pin_name3~output\ : cycloneiii_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst~combout\,
	devoe => ww_devoe,
	o => \pin_name3~output_o\);

-- Location: IOIBUF_X0_Y4_N15
\pin_name2~input\ : cycloneiii_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_pin_name2,
	o => \pin_name2~input_o\);

-- Location: IOIBUF_X5_Y0_N15
\pin_name1~input\ : cycloneiii_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_pin_name1,
	o => \pin_name1~input_o\);

-- Location: LCCOMB_X1_Y4_N24
inst : cycloneiii_lcell_comb
-- Equation(s):
-- \inst~combout\ = (\pin_name2~input_o\ & \pin_name1~input_o\)

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1010101000000000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \pin_name2~input_o\,
	datad => \pin_name1~input_o\,
	combout => \inst~combout\);

ww_pin_name3 <= \pin_name3~output_o\;
END structure;



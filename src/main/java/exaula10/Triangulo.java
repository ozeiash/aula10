/*
 * Copyright (C) 2024 Ozeias Campos <ozeiash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package exaula10;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 14/03/2024
 * @brief Class Triangulo
 */
public class Triangulo extends Figura {

    public double base;
    public double altura;
    public String cor;

    public double area() {
        return (base * altura) / 2;

    }

    public String toString() {
        return "Triangulo [Área= " + area() + ", cor= " + cor + "]";

    }
}

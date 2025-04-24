
import React, { useEffect, useState } from "react";
import axios from "axios";

interface Usina {
  id: number;
  nome: string;
  capacidade: number;
  uf: string;
}

const App: React.FC = () => {
  const [usinas, setUsinas] = useState<Usina[]>([]);

  useEffect(() => {
    axios.get<Usina[]>("http://localhost:8080/api/usinas/top5")
      .then(res => setUsinas(res.data))
      .catch(err => console.error("Erro ao buscar dados:", err));
  }, []);

  return (
    <div className="min-h-screen bg-gray-100 p-6">
      <h1 className="text-2xl font-bold mb-4">Top 5 Maiores Geradores de Energia</h1>
      <table className="w-full bg-white shadow rounded-xl">
        <thead>
          <tr className="bg-gray-200">
            <th className="p-3 text-left">Nome</th>
            <th className="p-3 text-left">UF</th>
            <th className="p-3 text-left">Capacidade (MW)</th>
          </tr>
        </thead>
        <tbody>
          {usinas.map(usina => (
            <tr key={usina.id} className="border-t">
              <td className="p-3">{usina.nome}</td>
              <td className="p-3">{usina.uf}</td>
              <td className="p-3">{usina.capacidade.toFixed(2)}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default App;

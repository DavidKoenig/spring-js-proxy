export async function getHello() {
  const response = await fetch('/api/hello');
  return await response.json();
}